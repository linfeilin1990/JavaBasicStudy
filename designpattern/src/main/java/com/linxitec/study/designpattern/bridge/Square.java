package com.linxitec.study.designpattern.bridge;

public class Square extends Shape {
    @Override
    public void draw() {
        color.bepaint("正方形");
    }
}
