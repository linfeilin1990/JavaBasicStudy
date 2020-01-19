package com.linxitec.study.designpattern.factoryPattern.abstractFactory;

public class HairFridge implements Fridge {
    @Override
    public void describe() {
        System.out.println("海尔冰箱");
    }
}
