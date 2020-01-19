package com.linxitec.study.designpattern.state;

public class App {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
    }
}
