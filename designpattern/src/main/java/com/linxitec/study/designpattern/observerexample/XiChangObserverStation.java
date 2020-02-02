package com.linxitec.study.designpattern.observerexample;

public class XiChangObserverStation implements ObserverStation {
    @Override
    public void record(String content) {
        System.out.println("西昌观察站开始记录---->"+content);
    }
}
