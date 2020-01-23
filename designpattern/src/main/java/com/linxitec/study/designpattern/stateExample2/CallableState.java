package com.linxitec.study.designpattern.stateExample2;
//可通话状态
public class CallableState extends TelecommunicationState {

    @Override
    public void charge() {
        System.out.println("【成功】：已为电话充值");
    }

    @Override
    public void powerOn() {
        System.out.println("【失败】：当前电话已经开机");
    }

    @Override
    public void powerOFF() {
        System.out.println("【成功】：电话即将关机");
        System.out.println("============即将转换为关机状态============");
        super.context.setCurrentState(Context.shutDownState);
    }

    @Override
    public void call() {
        System.out.println("【成功】：电话正在接通中");
        System.out.println("============即将转换为正在通话中状态============");
        super.context.setCurrentState(Context.callingState);
    }

    @Override
    public void handUp() {
        System.out.println("【失败】：还未拨打电话，不能挂断");
    }
}
