package com.linxitec.study.designpattern.commandPattern1;

public class ChangeTemperature extends Command{

    @Override
    public void execute() {
        super.airConditioning.changeTemperature();
    }
}
