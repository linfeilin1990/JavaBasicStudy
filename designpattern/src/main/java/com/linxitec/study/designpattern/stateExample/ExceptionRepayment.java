package com.linxitec.study.designpattern.stateExample;

public class ExceptionRepayment extends LoanState {
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
        System.out.println("准备计算高额利息");
    }

    @Override
    public void sendMessage(Loan loan) {
        System.out.println("未正常还款");
    }
}
