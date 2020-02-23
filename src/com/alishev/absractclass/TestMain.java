package com.alishev.absractclass;

public class TestMain {
    public static void main(String[] args) {

        Dog dog1=new Dog(); // создаем dog1 через Dog
        dog1.makeSound();
        dog1.eat();
        dog1.whoIAm(); // доступ есть

        System.out.println("-------------------------");

        Animal dog=new Dog(); // создаем Dog через Animal
        Animal cat=new Cat(); //
         // Animal dogerror = new Animal();// так нельзя для абстрактного класса

        dog.eat();
        // dog.whoIAm(); // Доступа нет - ошибка так как dog
                        // создается через абстрактный класс
        dog.makeSound(); // также сужается доступ к методам 

    }
}
