package com.yupi.cli.pattern;

/**
 * @Author: Tjb
 * @CreateTime: 2023-12-13  09:26
 * @Description: TODO
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 创建接受者对象
        Device tv = new Device("TV");
        Device stereo = new Device("Stereo");
        // 创建具体命令对象，可以绑定不同设备
        TurnOnCommand turnOnCommand = new TurnOnCommand(tv);
        TurnOffCommand turnOffCommand = new TurnOffCommand(stereo);
        // 创建调用者
        RemoteControl remote = new RemoteControl();
        // 执行命令
        remote.setControl(turnOnCommand);
        remote.pressButton();

        remote.setControl(turnOffCommand);
        remote.pressButton();
    }
}
