package com.mypackage;

public class HelloWorld {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        person1.introduce();
        person1.havaBirthday();

        person2.introduce();
        person2.havaBirthday();
    }
}
