package com.linxitec.study.designpattern.commandPattern1;

public class SweepingRobot implements HouseholdElectricAppliances {
    @Override
    public void turnOn() {
        System.out.println("扫地机器人开机");
    }

    @Override
    public void turnOff() {
        System.out.println("扫地机器人关机");
    }

    public void sweepFloor(){
        System.out.println("扫地机器人扫地");
    }
}
