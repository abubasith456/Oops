package com.example.oops;

import android.util.Log;

public class Test {

    static int a=0;

    public Test(){
        a++;
    }

    public void print(){
        Log.e("Added ", String.valueOf(a));
    }

}
