package com.build.factory_pattern.abstract_factory;

public class ProductFactoryA implements Provider{
    public MyInterface ProductA(){
        return new ProductA();
    }
    public MyInterface ProductB(){
        return new ProductB();
    }

    public MyInterface produce() {
        return new ProductA();
    }
}
