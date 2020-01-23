package com.linxitec.study.designpattern.commandPattern1;

public class Client {
    public static void main(String[] args) {
        //新建一个小度对象
        XiaoDu xiaoDu = new XiaoDu();
        //新建一个命令
        ChangeTemperature changeTemperature = new ChangeTemperature();
        //给小度下命令
        xiaoDu.setCommand(changeTemperature);
        //小度执行
        xiaoDu.action();
    }
}
