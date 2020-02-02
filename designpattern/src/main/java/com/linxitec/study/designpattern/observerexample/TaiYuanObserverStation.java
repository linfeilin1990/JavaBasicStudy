package com.linxitec.study.designpattern.observerexample;

public class TaiYuanObserverStation implements ObserverStation {
    @Override
    public void record(String content) {
        System.out.println("太原观察站开始记录----->"+content);
    }
}
