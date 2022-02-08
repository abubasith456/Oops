package com.example.oops.Model;

public class UserInfo {

   private String name,email;

   public UserInfo(){

   }

    public UserInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Encapsulation
    //Wrapping up data into single unit

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
