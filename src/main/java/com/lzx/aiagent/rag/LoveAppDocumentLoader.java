package com.lzx.aiagent.rag;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.document.Document;
import org.springframework.ai.reader.markdown.MarkdownDocumentReader;
import org.springframework.ai.reader.markdown.config.MarkdownDocumentReaderConfig;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 文档加载器
 */
@Component
@Slf4j
public class LoveAppDocumentLoader {
    private final ResourcePatternResolver resourcePatternResolver;

    public LoveAppDocumentLoader(ResourcePatternResolver resourcePatternResolver) {
        this.resourcePatternResolver = resourcePatternResolver;
    }

    /**
     * 加载文档
     * @return
     */
    public List<Document> loadDocument(){
        List<Document> allDocument = new ArrayList<>();
        try {
            Resource[] resources = resourcePatternResolver.getResources("classpath:documents/*.md");
            for (Resource resource : resources) {
                String filename = resource.getFilename();
                MarkdownDocumentReaderConfig config = MarkdownDocumentReaderConfig.builder()
                        .withHorizontalRuleCreateDocument(true)//遇到 --- 就切一段
                        .withIncludeBlockquote(false)//是否读取 MD 里的引用块
                        .withIncludeCodeBlock(false)//是否读取 MD 里的代码块
                        .withAdditionalMetadata("filename", filename)//给这段内容附加来源文件名
                        .build();
                MarkdownDocumentReader markdownDocumentReader = new MarkdownDocumentReader(resource, config);
                allDocument.addAll(markdownDocumentReader.get());
            }
        } catch (IOException e) {
            log.error("MarkDown文档加载失败",e);
            throw new RuntimeException(e);
        }

        return allDocument;
    }
}
