package com.build.singleton;
/**
 * 懒汉式 线程安全
 */
public class SingletonThread {
    private static SingletonThread singleton;
    private SingletonThread(){}

    public SingletonThread getSingleton(){
        synchronized (SingletonThread.class){
            if(singleton == null){
                singleton = new SingletonThread();
            }
            return singleton;
        }
    }
}
