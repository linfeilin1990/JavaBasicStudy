package com.linxitec.study.designpattern.proxy;

public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer=new PlayerOne("张三");
        IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
        gamePlayerProxy.login("zhangsan","123456");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
    }
}
