package com.linxitec.study.designpattern.factoryPattern.abstractFactory;

public class HisenseFactory implements AbstractFactory {
    @Override
    public Television createTV() {
        return new HisenseTV();
    }

    @Override
    public Fridge createFridge() {
        return new HisenseFridge();
    }
}
