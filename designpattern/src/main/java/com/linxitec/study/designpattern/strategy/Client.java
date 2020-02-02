package com.linxitec.study.designpattern.strategy;

public class Client {
    public static void main(String[] args) {
        Ipad ipad = new Ipad(new YouKu());
        ipad.playMove();
        Ipad ipad1 = new Ipad(new Tencent());
        ipad1.playMove();
    }
}
