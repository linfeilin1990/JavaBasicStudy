package com.linxitec.study.designpattern.commandPattern1;

public class Client {
    public static void main(String[] args) {
        TurnOnAirConditioning tn = new TurnOnAirConditioning();
        XiaoDu xiaoDu = new XiaoDu();
        xiaoDu.setCommand(tn);
        xiaoDu.action();
        ChangeTemperature changeTemperature = new ChangeTemperature();
        xiaoDu.setCommand(changeTemperature);
        xiaoDu.action();
    }
}
