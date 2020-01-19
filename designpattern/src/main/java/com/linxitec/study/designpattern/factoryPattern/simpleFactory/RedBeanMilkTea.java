package com.linxitec.study.designpattern.factoryPattern.simpleFactory;

public class RedBeanMilkTea implements Drink {
    @Override
    public void taste() {
        System.out.println("红豆奶茶");
    }
}
