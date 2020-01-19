package com.linxitec.study.designpattern.factoryPattern.abstractFactory;

public class HairFactory implements AbstractFactory {
    @Override
    public Television createTV() {
        return new HairTV();
    }

    @Override
    public Fridge createFridge() {
        return new HairFridge();
    }
}
