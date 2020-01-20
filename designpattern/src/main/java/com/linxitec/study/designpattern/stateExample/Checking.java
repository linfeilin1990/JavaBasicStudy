package com.linxitec.study.designpattern.stateExample;

public class Checking extends LoanState {
    @Override
    public void executeRepay() {
        System.out.println("贷款审批中，不能执行还款");
    }

    @Override
    public void rejectExecuteRepay() {
        System.out.println("贷款审批中，不能执行还款");
    }

    @Override
    public void grantLoan() {
        System.out.println("放款成功");
        super.context.setLoanState(Context.useing);
    }

    @Override
    public void calculateInterest(Loan loan) {
        System.out.println("利息尚未计算中");
    }

    @Override
    public void sendMessage(Loan loan) {
        System.out.println("贷款审批中");
    }
}
