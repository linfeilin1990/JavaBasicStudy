package com.linxitec.study.designpattern.commandPattern1;

public class AirConditioning implements HouseholdElectricAppliances {
    @Override
    public void turnOn() {
        System.out.println("打开空调");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭空调");
    }

    public void changeTemperature(){
        System.out.println("调节温度");
    }
}
