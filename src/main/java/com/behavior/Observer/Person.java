package com.behavior.Observer;

/**
 * 对象间一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 */
public interface Person {
    void getMessage(String s);
}
