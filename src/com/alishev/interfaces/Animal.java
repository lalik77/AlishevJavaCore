package com.alishev.interfaces;

public class Animal implements Info{

    int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {

        System.out.println("I am an animal and i will sleep");
    }

    @Override
    public void showinfo() {
        System.out.println("Id animal is - " + id);
    }
}
