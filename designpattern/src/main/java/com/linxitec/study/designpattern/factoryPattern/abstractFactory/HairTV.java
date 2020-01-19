package com.linxitec.study.designpattern.factoryPattern.abstractFactory;

public class HairTV implements Television {
    @Override
    public void describe() {
        System.out.println("海尔电视");
    }
}
