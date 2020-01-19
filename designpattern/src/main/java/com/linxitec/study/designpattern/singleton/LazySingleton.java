package com.linxitec.study.designpattern.singleton;

public class LazySingleton {
    //懒汉，即延迟加载，在调用的时候才加载
    private LazySingleton lazySingleton;
    public LazySingleton getInstance(){
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
