package com.alishev.interfaces;

public class Person implements Info{

    String name;

    public Person(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("I a human and i will sleep");
    }

    @Override
    public void showinfo() {
        System.out.println("Name is - " + name);
    }
}
