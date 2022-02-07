package com.example.oops.Abstract;

import android.util.Log;

public class Multiplication extends Calculator {

    @Override
    void calculate(int value1, int value2) {

        int result;
        result = value1 * value2;
        Log.e("Multiplication", String.valueOf(result));

    }
}
