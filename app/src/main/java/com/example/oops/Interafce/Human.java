package com.example.oops.Interafce;

import android.util.Log;

public class Human implements FirstClass, ThirdClass {

    @Override
    public void wakeUp() {
        Log.e("Human ", "Wake up");
    }

    @Override
    public void work() {
        Log.e("Human ", "Working");
    }

    @Override
    public void eat() {
        Log.e("Human ", "Eating");
    }

    @Override
    public void play() {
        Log.e("Human ", "Playing");
    }



    @Override
    public void study() {
        Log.e("Human ", "Studying");
    }

    @Override
    public void takeRest() {
        Log.e("Human ", "Take rest");
    }

    @Override
    public void sleep() {
        Log.e("Human ", "Sleeping");
    }

    public void print() {

        Human human = new Human();
        human.wakeUp();
        human.work();
        human.play();
        human.study();
        human.takeRest();
        human.eat();
        human.sleep();

    }


}
