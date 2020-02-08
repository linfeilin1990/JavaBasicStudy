package com.linxitec.study.basic.mulThread.realizationType;

public class R_App {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1200 ; i++) {
                    System.out.println("步行了"+i+"步");
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1200; i >0 ; i--) {
                    System.out.println("剩余时间："+i+"秒");
                }
            }
        }).start();
    }
}
