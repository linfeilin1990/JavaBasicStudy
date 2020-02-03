package com.linxitec.study.designpattern.observerexample;

public class JiuQUanObserverStation implements ObserverStation {
    @Override
    public void record(String content) {
        System.out.println("酒泉观察站开始记录---->"+content);
    }
}
