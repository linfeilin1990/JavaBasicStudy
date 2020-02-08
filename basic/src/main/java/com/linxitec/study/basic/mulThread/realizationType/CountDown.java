package com.linxitec.study.basic.mulThread.realizationType;

public class CountDown extends Thread {
    @Override
    public void run() {
        for (int i = 1200; i >0 ; i--) {
            System.out.println("剩余时间："+i+"秒");
        }
    }
}
