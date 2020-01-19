package com.linxitec.study.designpattern.factoryPattern.abstractFactory;

public class Client {
    public static void main(String[] args) {
        new HisenseFactory().createFridge().describe();
        new HisenseFactory().createTV().describe();
        new HairFactory().createFridge().describe();
        new HairFactory().createTV().describe();
    }
}
