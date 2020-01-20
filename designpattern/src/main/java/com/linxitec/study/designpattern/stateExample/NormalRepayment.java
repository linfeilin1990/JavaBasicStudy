package com.linxitec.study.designpattern.stateExample;

public class NormalRepayment extends LoanState {
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
        System.out.println("利息计算截止");
    }

    @Override
    public void sendMessage(Loan loan) {
        System.out.println("正常还款");
    }
}
