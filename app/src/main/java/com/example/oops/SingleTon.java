package com.example.oops;

import android.util.Log;

public class SingleTon {

    private static SingleTon instance;

    private SingleTon() {

    }

    //Only one object creation
    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }

    public void print() {
        Log.e("SingleTone ", "This is Singleton class ");
    }

}
