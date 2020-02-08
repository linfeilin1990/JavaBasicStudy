package com.linxitec.study.basic.mulThread.realizationType;

public class App {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();
        countDown.start();
        Walk walk = new Walk();
        walk.start();
        System.out.println("主线程");
    }
}
//匿名内部类简化
class simpleWithAnonymousClass{
    public static void main(String[] args) {
        //走步
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <1200 ; i++) {
                    System.out.println("步行了"+i+"步");
                }
            }
        }.start();
        //倒计时
        new Thread(){
            @Override
            public void run() {
                for (int i = 1200; i >0 ; i--) {
                    System.out.println("剩余时间："+i+"秒");
                }
            }
        }.start();
    }
}
