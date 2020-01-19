package com.linxitec.study.designpattern.state;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入硬币");
        gumballMachine.setState(gumballMachine.hasQuarterState);
    }

    @Override
    public void ejectQuarter() {
        System.out.println("操作错误");
    }

    @Override
    public void turnCrank() {
        System.out.println("操作错误");
    }

    @Override
    public void dispense() {
        System.out.println("操作错误");
    }
}
