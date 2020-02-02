package com.linxitec.study.designpattern.observerexample;

public interface Observed {
    public void addObserverStation(ObserverStation observerStation);
    public void deleteObserverStation(ObserverStation observerStation);
    public void notifyObserverStation(String content);
}
