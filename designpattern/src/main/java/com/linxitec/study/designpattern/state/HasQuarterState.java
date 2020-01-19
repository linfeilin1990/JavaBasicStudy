package com.linxitec.study.designpattern.state;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你已经投入硬币了，不能再投入了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退回硬币");
        gumballMachine.setState(gumballMachine.noQuarterState);
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果已出");
        gumballMachine.setState(gumballMachine.soldOutState);
    }

    @Override
    public void dispense() {
        System.out.println("状态操作不正确");
    }
}
