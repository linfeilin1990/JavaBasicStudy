package com.linxitec.study.designpattern.strategy;

public class Ipad {
    private MovieApp movieApp;

    public Ipad(MovieApp movieApp) {
        this.movieApp = movieApp;
    }

    public void playMove(){
        this.movieApp.readMovieResources();
    }
}
