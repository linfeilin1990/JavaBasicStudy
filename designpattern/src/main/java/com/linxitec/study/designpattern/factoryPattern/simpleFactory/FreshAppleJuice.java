package com.linxitec.study.designpattern.factoryPattern.simpleFactory;

public class FreshAppleJuice implements Drink {
    @Override
    public void taste() {
        System.out.println("鲜榨苹果汁");
    }
}
