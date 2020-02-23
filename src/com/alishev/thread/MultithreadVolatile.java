
package com.alishev.thread;

import java.util.Scanner;

public class MultithreadVolatile {

    public static void main(String[] args) {

        MyThreadVolatile thread1 = new MyThreadVolatile();

        thread1.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        thread1.shutDown();


    }
}

class MyThreadVolatile extends Thread {

    private  boolean running = true; // Без volatile  и с volatile

    @Override
    public void run() {
        while (running) {

            System.out.println("Hello");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }

    public void shutDown() {

        this.running = false;
    }

}