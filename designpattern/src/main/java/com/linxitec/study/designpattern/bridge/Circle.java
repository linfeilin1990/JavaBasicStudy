package com.linxitec.study.designpattern.bridge;

public class Circle extends Shape {
    @Override
    public void draw() {
        color.bepaint("圆圈");
    }
}
