package com.linxitec.study.designpattern.proxy;

public class PlayerOne implements IGamePlayer {
    private String name="";

    public PlayerOne(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为"+user+"的用户"+this.name+"登录游戏");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+"在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name+"在升级");
    }
}
