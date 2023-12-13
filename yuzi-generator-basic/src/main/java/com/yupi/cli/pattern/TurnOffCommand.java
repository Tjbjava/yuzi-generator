package com.yupi.cli.pattern;

/**
 * @Author: Tjb
 * @CreateTime: 2023-12-13  09:20
 * @Description: TODO
 * @Version: 1.0
 */
public class TurnOffCommand implements Command{

    private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
