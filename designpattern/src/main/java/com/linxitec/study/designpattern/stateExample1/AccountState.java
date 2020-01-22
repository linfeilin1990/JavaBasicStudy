package com.linxitec.study.designpattern.stateExample1;

public abstract class AccountState {
    protected Account account;
    public abstract void deposit(double amount);
    public abstract void withDraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}
