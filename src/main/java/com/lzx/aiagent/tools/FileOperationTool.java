package com.lzx.aiagent.tools;

import cn.hutool.core.io.FileUtil;
import com.lzx.aiagent.constant.FileConstant;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;

public class FileOperationTool {
    private final String fileDir = FileConstant.FILE_SAVE_DIR + "/file";

    @Tool(description = "Read content from a file")
    public String readFile(@ToolParam(description = "the file name") String fileName){
        if (!FileUtil.exist(fileDir + "/" + fileName)){
            return "the file not exist";
        }
        try {
            return FileUtil.readUtf8String(fileDir + "/" + fileName);
        } catch (Exception e) {
            return "read the file error:" + e.getMessage();
        }
    }

    @Tool(description = "Write content to a file")
    public String writeFile(@ToolParam(description = "the file name") String fileName, @ToolParam(description = "the file content") String content){
        try {
            FileUtil.writeUtf8String(content, fileDir + "/" + fileName);
            return "write the file success";
        } catch (Exception e) {
            return "write the file error:" + e.getMessage();
        }
    }
}
