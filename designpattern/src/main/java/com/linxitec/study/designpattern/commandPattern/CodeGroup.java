package com.linxitec.study.designpattern.commandPattern;

public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到代码组");
    }

    @Override
    public void add() {
        System.out.println("代码组新增功能");
    }

    @Override
    public void delete() {
        System.out.println("代码组删除功能");
    }

    @Override
    public void change() {
        System.out.println("代码组改变功能");
    }

    @Override
    public void plan() {
        System.out.println("代码组给出代码变更计划");
    }
}
