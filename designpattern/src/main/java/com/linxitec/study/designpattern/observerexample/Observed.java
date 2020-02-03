package com.linxitec.study.designpattern.observerexample;

public interface Observed {
    //给卫星新增一个观察站
    public void addObserverStation(ObserverStation observerStation);
    //删除一个观察站
    public void deleteObserverStation(ObserverStation observerStation);
    //给观察站发送信息
    public void notifyObserverStation(String content);
}
