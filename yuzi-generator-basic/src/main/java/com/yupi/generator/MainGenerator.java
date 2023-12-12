package com.yupi.generator;

import com.yupi.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Tjb
 * @CreateTime: 2023-12-12  08:50
 * @Description: TODO
 * @Version: 1.0
 */
public class MainGenerator {
    public static void main(String[] args) throws TemplateException, IOException {

        // 1. 静态文件生成
        String projectPath = System.getProperty("user.dir");
        //输入路径
        String inputPath = projectPath + File.separator + "yuzi-generator-demo-projects" + File.separator + "acm-template";
        //输出路径
        String outputPath = projectPath;
        // 复制
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);

        // 2. 动态文件生成
        String dynamicInputPath = projectPath + File.separator + "yuzi-generator-basic" + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String dynamicOutputPath = projectPath + File.separator + "acm-template/src/com/yupi/acm/MainTemplate.java";

        // 数据模型
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("tjb");
        mainTemplateConfig.setOutputText("输出结果");
        mainTemplateConfig.setLoop(true);

        DynamicGenerator.doGenerator(dynamicInputPath, dynamicOutputPath, mainTemplateConfig);
    }
}
