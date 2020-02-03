package com.linxitec.study.designpattern.observerexample;

public class ControlSystem {
    public static void main(String[] args) {
        ChangE changE = new ChangE();
        changE.addObserverStation(new JiuQUanObserverStation());
        changE.addObserverStation(new XiChangObserverStation());
        changE.speed();
        changE.temperature();
    }
}
