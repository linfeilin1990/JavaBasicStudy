package com.linxitec.study.designpattern.stateExample;

public class Context {
    public final static Checking checking=new Checking();
    public final static Useing useing=new Useing();
    public final static NormalRepayment normalRepayment=new NormalRepayment();
    public final static ExceptionRepayment exceptionRepayment=new ExceptionRepayment();

    private LoanState loanState;

    public Context() {

    }

    public void sendMessage(Loan loan){
        loanState.sendMessage(loan);
    }
    public void calculateInterest(Loan loan){
        loanState.calculateInterest(loan);
    }

    public  void executeRepay(){
        this.loanState.executeRepay();
    }
    public  void rejectExecuteRepay(){
        this.loanState.rejectExecuteRepay();
    }
    public  void grantLoan(){
        this.loanState.grantLoan();
    }

    public void setLoanState(LoanState loanState) {
        this.loanState = loanState;
        this.loanState.setContext(this);
    }

}
