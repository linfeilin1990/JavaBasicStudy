package com.linxitec.study.basic.innerclass.buildinnerclass;

public class Test {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.showInnerClass();
    }
}
