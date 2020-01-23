package com.linxitec.study.designpattern.stateExample2;

public abstract class TelecommunicationState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //缴费
    public abstract void charge();
    //开机
    public abstract void powerOn();
    //关机
    public abstract void powerOFF();
    //给当前手机打电话
    public abstract void call();
    //挂断
    public abstract void handUp();
}
