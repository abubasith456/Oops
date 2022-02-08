package com.example.oops.Interafce;

import android.util.Log;

public abstract class SecondClass implements ThirdClass {
    public abstract void takeRest();

    public void play() {
        Log.e("Human ", "Playing");
    }

    public void study() {
        Log.e("Human ", "Studying");
    }
}
