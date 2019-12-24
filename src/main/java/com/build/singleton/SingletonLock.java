package com.build.singleton;

/**
 * 双重检索模式
 */
public class SingletonLock {
    private volatile static SingletonLock singletonLock;
    public SingletonLock(){}

    public static SingletonLock getInstance() {
        if (singletonLock == null){
            synchronized (SingletonLock.class){
                if (singletonLock == null){
                    singletonLock = new SingletonLock();
                }
            }
        }
        return singletonLock;
    }
}
