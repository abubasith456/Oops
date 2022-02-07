package com.example.oops;

import android.util.Log;

public class Boy extends Human {

    public void eat() {
//        super.eat();    //To print the Super class method
        Log.e("Overriding ", "Boy is eating");
    }

    public void print(){
        Boy boy=new Boy();
        boy.eat();
    }
}
