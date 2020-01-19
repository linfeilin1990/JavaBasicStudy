package com.linxitec.study.designpattern.state;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("状态不对");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("状态不对");
    }

    @Override
    public void turnCrank() {
        System.out.println("状态不对");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseGumball();
        if (gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.noQuarterState);
        }else {
            gumballMachine.setState(gumballMachine.soldOutState);
        }
    }
}
