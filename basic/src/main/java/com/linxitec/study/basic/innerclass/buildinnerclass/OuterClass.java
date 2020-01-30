package com.linxitec.study.basic.innerclass.buildinnerclass;

public class OuterClass {
    public void showOuterClass(){
        System.out.println("这是外部类");
    }

    public class InnerClass{
        public void showInnerClass(){
            System.out.println("这是内部类");
        }
    }
}
