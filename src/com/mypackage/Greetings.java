package com.mypackage;

import com.google.gson.Gson;

public class Greetings{
    String name = "Nick";
    String myAttribute = "Hi " + name + " !";

    public void sayHello(){
        System.out.println("Hello from Greetings class!");
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public void displayToJson() {
        System.out.println(this.toJson());
    }
}