package com.linxitec.study.basic.innerclass.fieldclass;

public class App {
    public static void main(String[] args) {
        new Men().showHusbandInfo();
        System.out.println("================");
        //访问内部类的格式
        Men.Woman woman = new Men().new Woman();
        woman.showWifeInfo();
    }
}

//隐藏机制:内部类封装性更好，隐藏在一个类之中，同一包中的其他类也不能访问