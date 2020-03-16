package com.alishev.thread;

import java.util.Scanner;

public class WaitNotify {



    public static void main(String[] args) throws InterruptedException {

        Realisation wn= new Realisation();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


    }
}

class Realisation {

    public  void produce() throws InterruptedException {

        synchronized (this) {
            System.out.println("producear Thread is started...");
            wait();
            System.out.println("Produced thread resumed....");
        }

    }

    public void consume() throws InterruptedException {

        Thread.sleep(2000);

        Scanner sc=new Scanner(System.in);

        synchronized (this) {

            System.out.println("Waiting for return key pressed ");
            sc.nextLine();
            notify();
            // notifyAll();

            Thread.sleep(5000);
        }



    }
}
