package com.linxitec.study.designpattern.commandPattern1;

public class XiaoDu {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
