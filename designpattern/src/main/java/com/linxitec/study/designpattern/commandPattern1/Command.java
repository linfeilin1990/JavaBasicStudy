package com.linxitec.study.designpattern.commandPattern1;

public abstract class Command {
    protected AirConditioning airConditioning=new AirConditioning();
    protected SweepingRobot sweepingRobot=new SweepingRobot();
    protected Television television=new Television();

    public abstract void execute();

}
