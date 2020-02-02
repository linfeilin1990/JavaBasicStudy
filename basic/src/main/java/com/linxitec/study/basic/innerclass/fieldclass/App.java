package com.linxitec.study.basic.innerclass.fieldclass;


public class App {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.showInner();
    }
}
