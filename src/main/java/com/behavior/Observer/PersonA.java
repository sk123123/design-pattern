package com.behavior.Observer;

public class PersonA implements Person {
    public void getMessage(String s) {
        System.out.print("PersonA获取消息"+s);
    }
}
