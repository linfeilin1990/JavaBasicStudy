package com.linxitec.study.basic.reflect;

public class Student {
    private String name;
    public String gender;
    private int age;

    //无参构造
    public Student() {
    }
    //带参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //私有构造方法
    private Student(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
