package com.linxitec.study.basic.mulThread;

public class Ticket extends Thread {
    private int number=100;

    @Override
    public void run() {

        while (true){
            if (number>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在出售第"+number+"张票");
                number--;
            }
        }
    }
}
class MainTest{
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.start();

        new Thread(){
            @Override
            public void run() {
                super.run();
            }
        }.start();

        new Thread(new Runnable(){
            @Override
            public void run() {

            }
        }).start();
    }
}