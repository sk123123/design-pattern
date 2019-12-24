package com.behavior.Observer;

public class PersonC implements Person {
    public void getMessage(String s) {
        System.out.print("PersonC获取消息"+s);
    }
}
