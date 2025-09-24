package com.mypackage;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Bonjour, je m'appelle " + name + " et j'ai " + age + " ans");
    }

    public void havaBirthday() {
        age++;
        System.out.println("Joyeux anniversaire, " + name + " ! Tu as maintenant " + age + " ans.");
    }
}
