package com.mt.multithreading;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hello");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t=new Thread(new RunnableThread());
        t.start();
    }
}
