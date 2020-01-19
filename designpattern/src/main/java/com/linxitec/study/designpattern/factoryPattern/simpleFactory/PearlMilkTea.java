package com.linxitec.study.designpattern.factoryPattern.simpleFactory;

public class PearlMilkTea implements Drink {
    @Override
    public void taste() {
        System.out.println("珍珠奶茶");
    }
}
