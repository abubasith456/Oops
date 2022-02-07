package com.example.oops.Abstract;

public class MyClass {

    public void print(int value1, int value2) {

        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();

        addition.calculate(value1, value2);
        subtraction.calculate(value1, value2);
        multiplication.calculate(value1, value2);
    }

}
