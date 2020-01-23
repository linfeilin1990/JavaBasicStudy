package com.linxitec.study.designpattern.stateExample2;

public class ShutDownState extends TelecommunicationState {
    @Override
    public void charge() {
        System.out.println("【成功】：已为电话充值");
    }

    @Override
    public void powerOn() {
        System.out.println("【成功】：当前电话正在开机");
        System.out.println("============即将转换为可通话状态============");
        super.context.setCurrentState(Context.callableState);
    }

    @Override
    public void powerOFF() {
        System.out.println("【失败】：当前手机已在关机状态");
    }

    @Override
    public void call() {
        System.out.println("【失败】：您所拨打的电话已关机");
    }

    @Override
    public void handUp() {
        System.out.println("【失败】：关机状态下不能执行挂断操作");
    }
}
