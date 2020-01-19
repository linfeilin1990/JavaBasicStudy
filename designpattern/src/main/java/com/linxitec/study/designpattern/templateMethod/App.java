package com.linxitec.study.designpattern.templateMethod;

public class App {
    public static void main(String[] args) {
        new StringDisplay("hello").display();
        new CharDisplay('H').display();
    }
}
