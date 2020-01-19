package com.linxitec.study.designpattern.factoryPattern.simpleFactory;

public class Client {
    public static void main(String[] args) {
        Drink drink = ItsTime.createDrink("鲜榨苹果汁");
        drink.taste();
    }
}
