package com.example.oops;

import android.util.Log;

public class Exception {

    int a=50;
    int b=0;

    public void divide(){

        int c=a/b;
        Log.e("Divide ", String.valueOf(c));

    }
    public void add(){

        int c=a+b;
        Log.e("Add ", String.valueOf(c));

    }
}
