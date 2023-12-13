package com.yupi.generator;

import com.yupi.model.MainTemplateConfig;
import freemarker.template.TemplateException;
import java.io.File;
import java.io.IOException;

import static com.yupi.generator.DynamicGenerator.doGenerator;


/**
 * @Author: Tjb
 * @CreateTime: 2023-12-12  08:50
 * @Description: TODO
 * @Version: 1.0
 */
public class MainGenerator {
    public static void main(String[] args) throws TemplateException, IOException {
        // 数据模型
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("tjb");
        mainTemplateConfig.setOutputText("输出结果");
        mainTemplateConfig.setLoop(true);

        doGenerate(mainTemplateConfig);
    }

    public static void doGenerate(Object model) throws TemplateException, IOException {
        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath : " + projectPath);
        // 整个项目的根路径
        File parentFile = new File(projectPath).getParentFile();
        // 输入路径
        String inputPath =new File(parentFile, "yuzi-generator-demo-projects/acm-template").getAbsolutePath();
        // 输出路径
        String outputPath = projectPath;
        // 生成静态文件
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);
        // 动态文件生成
        String inputDynamicFilePath = projectPath + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String outputDynamicFilePath = projectPath + File.separator + "acm-template/src/com/yupi/acm/MainTemplate.java";
        doGenerator(inputDynamicFilePath, outputDynamicFilePath, model);
    }
}
