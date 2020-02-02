package com.linxitec.study.designpattern.strategy;

public class Tencent implements MovieApp {
    @Override
    public void readMovieResources() {
        System.out.println("腾讯视频");
    }
}
