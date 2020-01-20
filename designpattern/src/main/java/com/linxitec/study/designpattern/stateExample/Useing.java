package com.linxitec.study.designpattern.stateExample;

public class Useing extends LoanState {
    @Override
    public void executeRepay() {


    }

    @Override
    public void rejectExecuteRepay() {

    }

    @Override
    public void grantLoan() {

    }

    @Override
    public void calculateInterest(Loan loan) {
        System.out.println("正常计算利息中");
    }

    @Override
    public void sendMessage(Loan loan) {
        System.out.println("贷款使用中");
    }
}
