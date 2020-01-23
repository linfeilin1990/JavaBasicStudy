package com.linxitec.study.designpattern.stateExample2;

public class Context {
    //欠费状态
    public final static TelecommunicationState arrearageState=new ArrearageState();
    //可通话状态
    public final static TelecommunicationState callableState=new CallableState();
    //正在通话状态
    public final static TelecommunicationState callingState=new CallingState();
    //关机状态
    public final static TelecommunicationState shutDownState=new ShutDownState();

    //当前状态
    private TelecommunicationState currentState;
    //获得当前状态
    public TelecommunicationState getCurrentState() {
        return currentState;
    }
    //设置当前状态
    public void setCurrentState(TelecommunicationState currentState) {
        this.currentState = currentState;
        //切换状态
        this.currentState.setContext(this);
    }
    //行为委托
    public void charge(){
        this.currentState.charge();
    }
    //开机
    public  void powerOn(){
        this.currentState.powerOn();
    }
    //关机
    public  void powerOFF(){
        this.currentState.powerOFF();
    }
    //给当前手机打电话
    public  void call(){
        this.currentState.call();
    }
    //挂断
    public  void handUp(){
        this.currentState.handUp();
    }
}
