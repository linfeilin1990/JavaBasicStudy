package com.linxitec.study.basic.mulThread.ThreadControl;

public class MyThread extends Thread {
    private String name;
    public MyThread(String name) {
        super(name);
        this.name=name;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程"+name + "运行 : " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
    }
}
class App{
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"主线程运行开始!");
        MyThread myThreadA = new MyThread("A");
        MyThread myThreadB = new MyThread("B");
        myThreadA.start();
        myThreadB.start();
        myThreadA.join();
        myThreadB.join();
        System.out.println(Thread.currentThread().getName()+ "主线程运行结束!");
    }
}