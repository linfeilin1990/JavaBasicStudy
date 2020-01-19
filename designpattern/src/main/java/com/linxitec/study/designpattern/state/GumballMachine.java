package com.linxitec.study.designpattern.state;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state=soldState;
    int count=0;

    public GumballMachine(int numberGumballs) {
        soldOutState=new SoldOutState(this);
        noQuarterState=new NoQuarterState(this);
        hasQuarterState= new HasQuarterState(this);
        soldState=new SoldState(this);

        this.count=numberGumballs;

        if (numberGumballs>0){
            state=noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
    }
    public void dispense(){
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }


    public void releaseGumball(){
        System.out.println("发糖果了");
        if (count!=0){
            count=count-1;
        }
    }

    public int getCount() {
        return count;
    }
}
