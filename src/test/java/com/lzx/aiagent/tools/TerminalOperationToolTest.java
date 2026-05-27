package com.lzx.aiagent.tools;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerminalOperationToolTest {

    @Test
    void executeTerminalCommand() {
        TerminalOperationTool terminalOperationTool = new TerminalOperationTool();
        String result = terminalOperationTool.executeTerminalCommand("dir");
        assertNotNull(result);
        assertFalse(result.startsWith("Command failed"), "Command failed unexpectedly");
        System.out.println(result);
    }
}