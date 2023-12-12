package com.yupi.generator;

import cn.hutool.Hutool;
import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 * @Author: Tjb
 * @CreateTime: 2023-12-11  20:19
 * @Description: 静态文件生成器
 * @Version: 1.0
 */
public class StaticGenerator {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        //输入路径
        String inputPath = projectPath + File.separator + "yuzi-generator-demo-projects" + File.separator + "acm-template";
        //输出路径
        String outputPath = projectPath;
        // 复制
        copyFilesByHutool(inputPath, outputPath);
    }

    /**
     *方法功能：拷贝文件(Hutool 实现，会将输入目录完整拷贝到输出目录下)
     *
     * @param inputPath 输入路径
     * @param outputPath 输出路径
     * @date 2023/12/11 20:24
     * @author Tjb
     * @return
     */
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }
}
