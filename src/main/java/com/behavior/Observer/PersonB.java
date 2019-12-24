package com.behavior.Observer;

public class PersonB implements Person{
    public void getMessage(String s) {
        System.out.print("PersonB获取消息"+s);
    }
}
