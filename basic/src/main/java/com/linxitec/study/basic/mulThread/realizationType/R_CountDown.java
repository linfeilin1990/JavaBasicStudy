package com.linxitec.study.basic.mulThread.realizationType;

public class R_CountDown implements Runnable {
    @Override
    public void run() {
        for (int i = 1200; i >0 ; i--) {
            System.out.println("剩余时间："+i+"秒");
        }
    }
}
