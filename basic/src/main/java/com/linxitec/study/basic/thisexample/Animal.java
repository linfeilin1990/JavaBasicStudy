package com.linxitec.study.basic.thisexample;

//Animal类
public class Animal {
    Animal instance;

    public Animal(){
        instance = this;
        System.out.println("我是无参的构造函数");
    }


    public void introduce() {
        System.out.println(this);
        System.out.println("I am an animal!");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.introduce();
    }
}

