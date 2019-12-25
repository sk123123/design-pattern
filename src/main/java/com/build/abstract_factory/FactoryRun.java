package com.build.abstract_factory;
/**
 * 测试
 */
public class FactoryRun {
    public static void main(String[] args) {
        Provider provider = new ProductFactoryA();
        MyInterface myi = provider.produce();
        myi.productName();
    }
}
