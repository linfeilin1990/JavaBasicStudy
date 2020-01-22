package com.linxitec.study.designpattern.stateExample1;

public class OverdraftState extends AccountState {

    public OverdraftState(AccountState accountState) {
        this.account=accountState.account;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withDraw(double amount) {

    }

    @Override
    public void computeInterest() {

    }

    @Override
    public void stateCheck() {

    }
}
