package com.linxitec.study.designpattern.stateExample;

public abstract class LoanState {
    protected Context context;
    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void executeRepay();
    public abstract void rejectExecuteRepay();
    public abstract void grantLoan();
    public abstract void calculateInterest(Loan loan);
    public abstract void sendMessage(Loan loan);


}
