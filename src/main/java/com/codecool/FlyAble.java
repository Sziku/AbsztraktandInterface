package com.codecool;

public interface FlyAble {
    void fly();

    default int myMthod(){
        return 5;
    }
}
