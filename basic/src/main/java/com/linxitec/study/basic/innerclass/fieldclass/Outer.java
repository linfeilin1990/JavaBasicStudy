package com.linxitec.study.basic.innerclass.fieldclass;

public class Outer {
    private int a=100;
    int b=5;

    public class Inner{
        int b=3;
        public void showInner(){
            System.out.println("访问外部类私有变量a= "+a);
            System.out.println("访问外部类的b= "+Outer.this.b);
        }
    }
}
