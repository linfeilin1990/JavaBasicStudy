package com.linxitec.study.designpattern.observer;

import java.util.ArrayList;

public class HanFeiZi implements IHanFeiZi,Observable {
    private ArrayList<Observer> observerArrayList=new ArrayList<Observer>();

    @Override
    public void haveBreakFast() {
        System.out.println("韩非子：开始吃饭了");
        this.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了");
        this.notifyObservers("韩非子在玩");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerArrayList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerArrayList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : observerArrayList) {
            observer.update(context);
        }
    }
}
