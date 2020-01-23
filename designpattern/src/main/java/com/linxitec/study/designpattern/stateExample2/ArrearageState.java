package com.linxitec.study.designpattern.stateExample2;
//欠费状态
public class ArrearageState extends TelecommunicationState {
    @Override
    public void charge() {
        System.out.println("【成功】：已为电话充值");
        System.out.println("============即将转换为可通话状态============");
        super.context.setCurrentState(Context.callableState);
    }

    @Override
    public void powerOn() {
        System.out.println("【成功】：电话开机");
    }

    @Override
    public void powerOFF() {
        System.out.println("【成功】：电话关机");
    }

    @Override
    public void call() {
        System.out.println("【失败】：当前用户已经欠费");
    }

    @Override
    public void handUp() {
        System.out.println("【失败】：不能调用当前方法，当前用户已经欠费");
    }
}
