package com.alishev.thread;

public class Multithread {

    public static void main(String[] args) {

        System.out.println("Hello from main");

        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();

        thread1.start();
        thread2.start();

        Thread thread3=new Thread(new MyRunnable());
        thread3.start();


    }
}


class MyThread extends Thread {

    @Override
    public void run() {

        for (int i=1;i<=1000;i++) {

            try {
                Thread.sleep(1000); // статический метод , исключение обязательно
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("From thread " + i);
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int j=1000;j>0;j--) {

            System.out.println("From MyRunnable " + j);
        }
    }
}