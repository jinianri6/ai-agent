package com.lzx.aiagent.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieOperationToolTest {

    @Test
    void readFile() {
        //读测试
        FileOperationTool fieOperationTool = new FileOperationTool();
        String result = fieOperationTool.readFile("test.txt");
        System.out.println(result);
    }

    @Test
    void writeFile() {
        //写测试
        FileOperationTool fieOperationTool = new FileOperationTool();
        String result = fieOperationTool.writeFile("test.txt", "hello world");
        System.out.println(result);
    }
}