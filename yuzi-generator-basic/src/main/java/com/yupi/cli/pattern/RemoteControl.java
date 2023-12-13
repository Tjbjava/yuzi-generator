package com.yupi.cli.pattern;

/**
 * @Author: Tjb
 * @CreateTime: 2023-12-13  09:25
 * @Description: TODO
 * @Version: 1.0
 */
public class RemoteControl {

    private Command command;

    public void setControl(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
