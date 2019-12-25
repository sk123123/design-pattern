package com.build.factory_pattern.public_factory;

/**
 * 创建工厂
 */
public class CommonFactory {
    //普通工厂模式
    public  CommonInterFace product(String type){
        if ("One".equals(type)) {
            return new CommonA();
        } else if ("Two".equals(type)) {
            return new CommonB();
        } else {
            System.out.println("没有要找的类型");
            return null;
        }
    }
    //多个工厂模式
    //静态工厂：多个工厂里方法置为静态 static
    public  CommonInterFace CommonA(){
        return new CommonA();
    }
    public  CommonInterFace CommonB(){
        return new CommonB();
    }

    public static void main(String[] args) {
        CommonFactory factory = new CommonFactory();
        CommonInterFace myi = factory.product("One");
        myi.print();
    }
}
