package com.linxitec.study.designpattern.observer;

public class Client {
    public static void main(String[] args) {
       Observer lisi=new LiSi();
       Observer wangsi=new WangSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(wangsi);
        hanFeiZi.haveBreakFast();
    }
}
