package com.lzx.aiagent;

import cn.hutool.core.lang.UUID;
import com.lzx.aiagent.app.LoveApp;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class AiAgentApplicationTests {
    @Resource
    private LoveApp loveApp;
    @Test
    void contextLoads() {
        String uuid = UUID.randomUUID().toString();
        String ans = loveApp.doChat("我是入机，对象是人机", uuid);
        Assertions.assertNotNull(ans);
        ans = loveApp.doChat("我刚刚说我对象是谁？", uuid);
        Assertions.assertNotNull(ans);
    }
    @Test
    void testReport() {
        String uuid = UUID.randomUUID().toString();

        LoveApp.LoveReport loveReport = loveApp.doChatWithReport("你还在吗", uuid);
        Assertions.assertNotNull(loveReport);
        loveReport = loveApp.doChatWithReport("你好，我是串子，我想让另一半小草更爱我，但我不知道该怎么做", uuid);
        Assertions.assertNotNull(loveReport);
    }

}
