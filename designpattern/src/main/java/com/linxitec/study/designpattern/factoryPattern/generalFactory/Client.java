package com.linxitec.study.designpattern.factoryPattern.generalFactory;

public class Client {
    public static void main(String[] args) {
        /*来一倍鲜榨苹果汁*/
        AbstractItsTime abstractItsTime=new FreshAppleJuiceFactory();
        abstractItsTime.createDrink().taste();
    }
}
