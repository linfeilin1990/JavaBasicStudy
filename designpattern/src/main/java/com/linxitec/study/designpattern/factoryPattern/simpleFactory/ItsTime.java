package com.linxitec.study.designpattern.factoryPattern.simpleFactory;

public class ItsTime {
    public static Drink createDrink(String name){
        Drink drink=null;
        switch (name){
            //鲜榨苹果汁
            case Menu.FAJ:
                drink=new FreshAppleJuice();
                break;
            //珍珠奶茶
            case Menu.PMT:
                drink=new PearlMilkTea();
                break;
            //红豆奶茶
            case Menu.RBMT:
                drink=new RedBeanMilkTea();
                break;
            default:
                System.out.println("无该饮品");
                break;
        }
        return drink;
    }
}
