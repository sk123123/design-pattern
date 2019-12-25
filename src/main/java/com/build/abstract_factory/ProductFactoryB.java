package com.build.abstract_factory;

public class ProductFactoryB implements Provider{
    public MyInterface ProductA(){
        return new ProductA();
    }
    public MyInterface ProductB(){
        return new ProductB();
    }

    public MyInterface produce() {
        return new ProductB();
    }
}
