package com.linxitec.study.designpattern.singleton;

public class Singleton {
    //饿汉加载
    private static Singleton singleton=new Singleton();
    private  Singleton(){
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
