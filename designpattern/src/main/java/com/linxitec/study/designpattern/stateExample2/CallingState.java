package com.linxitec.study.designpattern.stateExample2;
//正在通话状态
public class CallingState extends TelecommunicationState {
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
        System.out.println("【成功】：通话即将挂断，电话即将关机");
        System.out.println("============即将转换为关机状态============");
        super.context.setCurrentState(Context.shutDownState);
    }

    @Override
    public void call() {
        System.out.println("【失败】：您所拨打的电话正在通话中");
    }

    @Override
    public void handUp() {
        System.out.println("【成功】：通话结束");
        System.out.println("============即将转换为可通话状态============");
        super.context.setCurrentState(Context.callableState);
    }
}
