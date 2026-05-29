package com.lzx.aiagent.agent;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyManusTest {
    @Resource
    private MyManus myManus;

    @Test
    void run(){
        String result = myManus.run("帮我生成一个pdf,内容为11111");
    }
}