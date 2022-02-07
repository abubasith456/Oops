package com.example.oops.Interafce;

import android.util.Log;

public class Human implements MyClass{

    @Override
    public void wakeUp() {
        Log.e("Human ", "Wake up");
    }

    @Override
    public void work() {
        Log.e("Human ", "Work");
    }

    @Override
    public void eat() {
        Log.e("Human ", "Eat");
    }

    @Override
    public void sleep() {
        Log.e("Human ", "Sleep");
    }

   public void print(){

        Human human=new Human();
        human.wakeUp();
        human.work();
        human.eat();
        human.sleep();

    }
}
