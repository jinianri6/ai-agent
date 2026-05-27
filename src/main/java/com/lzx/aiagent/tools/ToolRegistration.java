package com.lzx.aiagent.tools;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToolRegistration {
    @Value("${search-api.api-key}")
    private String apiKey;

    @Bean
    public ToolCallback[] allTools(){
        WebSearchTool webSearchTool = new WebSearchTool(apiKey);
        FileOperationTool fieOperationTool = new FileOperationTool();
        TerminalOperationTool terminalOperationTool = new TerminalOperationTool();
        WebScrapingTool webScrapingTool = new WebScrapingTool();
        PDFGenerationTool pdfGenerationTool = new PDFGenerationTool();
        ResourceDownloadTool resourceDownloadTool = new ResourceDownloadTool();
        return ToolCallbacks.from(
                webSearchTool,
                fieOperationTool,
                terminalOperationTool,
                webScrapingTool,
                pdfGenerationTool,
                resourceDownloadTool
        );
    }
}
