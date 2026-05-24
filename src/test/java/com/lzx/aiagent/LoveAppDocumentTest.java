package com.lzx.aiagent;

import cn.hutool.core.lang.UUID;
import com.lzx.aiagent.app.LoveApp;
import com.lzx.aiagent.rag.LoveAppDocumentLoader;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoveAppDocumentTest {
    @Resource
    private LoveAppDocumentLoader loveAppDocumentLoader;
    @Resource
    private LoveApp loveApp;
    @Test
    void testLoadDocument() {
        loveAppDocumentLoader.loadDocument();

    }

    @Test
    void doChatWithRag() {
        String uuid = UUID.randomUUID().toString();
        String ans = loveApp.doChatWithRag("我已经结婚了，但婚后关系不太好，怎么办？", uuid);
        Assertions.assertNotNull(ans);
    }
}
