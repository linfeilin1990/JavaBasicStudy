package com.linxitec.study.basic.mulThread.ThreadControl;

import java.time.LocalTime;

public class TimeThread extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Walk extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=1200 ; i++) {
            Thread.currentThread().setName("走路线程->走到第"+i+"步");
        }
    }
}
class Test{
    public static void main(String[] args) {
        //走路线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1200; i++) {
                    System.out.println("走路线程->走到第" + i + "步");
                }
            }
        }).start();
        //时间线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(LocalTime.now());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.setDaemon(true);
    }
}