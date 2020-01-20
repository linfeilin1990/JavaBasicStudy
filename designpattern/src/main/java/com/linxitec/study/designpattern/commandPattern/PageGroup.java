package com.linxitec.study.designpattern.commandPattern;

public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到美工");
    }

    @Override
    public void add() {
        System.out.println("新增页面");
    }

    @Override
    public void delete() {
        System.out.println("删除页面");
    }

    @Override
    public void change() {
        System.out.println("改变页面");
    }

    @Override
    public void plan() {
        System.out.println("页面变更计划");
    }
}
