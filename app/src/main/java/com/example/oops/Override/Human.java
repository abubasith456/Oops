package com.example.oops.Override;

import android.util.Log;

public class Human {

    //Final example //Cannot change the value for final variables.
    final int a = 50;

    public void eat() {
        Log.e("Overriding ", "Human is eating");
    }

    public void sleep() {
        Log.e("Overriding ", "Human is sleeping");
    }

    //Cannot override the final method.
    public final void example() {

    }

    //Final class cannot be inherit.

}

