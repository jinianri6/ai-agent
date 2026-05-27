package com.lzx.aiagent.tools;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.ai.tool.annotation.ToolParam;


public class WebScrapingTool {
    public String scrapeWeb(@ToolParam(description = "URL to scrape") String url) {
        try{
            Document doc = Jsoup.connect(url).get();
            return doc.html();
        }catch (Exception e){
            return "Error scraping web page:" + e.getMessage();
        }
    }
}
