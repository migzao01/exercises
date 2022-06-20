package org.academiadecodigo.bootcamp.explicitthreadcreation;

public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
