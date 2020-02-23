package com.alishev.interfaces;

public class TestMain {

    public static void main(String[] args) {
        Animal animal1=new Animal(1);
        Person person1=new Person("Alex");
        animal1.showinfo();
        animal1.sleep();
        person1.showinfo();
        person1.sleep();

        Info info1 = new Animal(2); // Класс Animal реализует интефейс Info
                                       // Поэтому так можно писать
                                       // Ограничили методы класса Animal к методам
                                       // интерфейса
        Info info2 = new Person("Mike"); //

        info1.showinfo(); // можем вызвать методы showinfo() у двух разных объектов
        info2.showinfo(); // но к методам например sleep() нет доступа
        // info1.sleep() // Error

        Info info3 = new Animal(5);
        Person person3=new Person("Said");

        outputInfo( info3); // передаем в стат метод нечто что реализует интерфейс info
                            // в качестве аргументов на вход
                            //
        outputInfo(person3); // передаем в стат метод объект типа Person или Animal,
                             // и все работает только потому что они реализуют
                            //  интефейс Info



    }

    public static void outputInfo(Info i) {

        i.showinfo();
    }
}
