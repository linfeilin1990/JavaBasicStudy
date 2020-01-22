package com.linxitec.study.designpattern.commandPattern1;

public class TurnOnAirConditioning extends Command {


    @Override
    public void execute() {
        super.airConditioning.turnOn();
    }
}
