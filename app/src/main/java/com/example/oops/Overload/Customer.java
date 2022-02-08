package com.example.oops.Overload;

import android.util.Log;

public class Customer {

    String name, email, password;

    //Method overloaded.
    //Overload depends on number of arguments.
    //Not depends on method name.

    public void form(String name, String password) {
        this.name = name;
        this.password = password;
        Log.e("Customer ", "2 argument passed");
    }

    public void form(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        Log.e("Customer ", "3 argument passed");
    }

}
