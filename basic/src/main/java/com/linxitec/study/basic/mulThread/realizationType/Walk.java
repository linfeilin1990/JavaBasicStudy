package com.linxitec.study.basic.mulThread.realizationType;

public class Walk extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <1200 ; i++) {
            System.out.println("步行了"+i+"步");
        }
    }
}
