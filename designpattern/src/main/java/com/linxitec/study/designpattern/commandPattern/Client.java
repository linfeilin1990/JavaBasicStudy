package com.linxitec.study.designpattern.commandPattern;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new AddRequirementCommand());
        invoker.action();
    }
}
