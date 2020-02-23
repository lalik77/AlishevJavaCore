package com.alishev.absractclass;

public class Dog extends Animal {

    public void whoIAm() {

        System.out.println("I am Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
