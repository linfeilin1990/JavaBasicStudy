package com.linxitec.study.designpattern.observerexample;

import java.util.ArrayList;

public class ChangE implements Satellite,Observed {
    private ArrayList<ObserverStation> observerStationArrayList=new ArrayList<ObserverStation>();


    @Override
    public void addObserverStation(ObserverStation observerStation) {
        observerStationArrayList.add(observerStation);
    }

    @Override
    public void deleteObserverStation(ObserverStation observerStation) {
        observerStationArrayList.remove(observerStation);
    }

    @Override
    public void notifyObserverStation(String content) {
        for (ObserverStation station : observerStationArrayList) {
            station.record(content);
        }
    }

    @Override
    public void speed() {
        this.notifyObserverStation("当前速度为10.48km/s");
    }

    @Override
    public void temperature() {
        this.notifyObserverStation("当前的温度为87摄氏度");
    }
}
