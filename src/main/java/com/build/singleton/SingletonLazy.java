package com.build.singleton;

/**
 * 懒汉式
 */
public class SingletonLazy {
    private static SingletonLazy singleton;
    private SingletonLazy(){}

    public SingletonLazy getSingleton(){
        if(singleton == null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
