package com.yupi;

import com.yupi.cli.CommandExecutor;

import java.io.File;

public class Main {
    public static void main(String[] args) {
//        String parentFile = new File(System.getProperty("user.dir")).getParent();
//        System.out.println(parentFile);
//        args = new String[]{"generate", "-l", "-a", "-o"};
//        args = new String[]{"config"};
//        args = new String[]{"list"};
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}