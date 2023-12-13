package com.yupi.cli.pattern;

/**
 * @Author: Tjb
 * @CreateTime: 2023-12-13  09:21
 * @Description: TODO
 * @Version: 1.0
 */
public class Device {

    private String name;

    public Device(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + "设备打开");
    }

    public void turnOff() {
        System.out.println(name + "设备关闭");
    }
}
