package com.linxitec.study.designpattern.stateExample2;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ArrearageState());
        context.charge();
        context.call();
        context.handUp();
    }
}
