package com.linxitec.study.designpattern.commandPattern1;

public class Television implements HouseholdElectricAppliances {
    @Override
    public void turnOn() {
        System.out.println("打开电视");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭电视");
    }

    public void changeChannel(){
        System.out.println("电视机换台");
    }
}
