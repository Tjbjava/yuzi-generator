package com.yupi.maker.model;

import lombok.Data;

/**
 * @Author: Tjb
 * @CreateTime: 2023-12-12  08:02
 * @Description: TODO
 * @Version: 1.0
 */
@Data
public class DataModel {

    // 需求
    // 1. 在代码开头增加@author 注释（增加代码）
    // 2. 修改程序输出的信息提示（替换代码）
    // 3. 将循环读取输入改为单词读取（可选代码）
    /**
     * 作者
     */
    private String author = "tjb";
    /**
     * 输出信息
     */
    private String outputText = "输出结果";

    /**
     * 是否循环（开关）
     */
    private boolean loop;

}
