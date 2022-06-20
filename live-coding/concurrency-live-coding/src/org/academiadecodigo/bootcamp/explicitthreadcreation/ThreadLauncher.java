package org.academiadecodigo.bootcamp.explicitthreadcreation;

public class ThreadLauncher {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Thread thread = new Thread(new MyThread());
        Thread t = new Thread(new MyThread());
        thread.setName("batata");
        t.setName("cebola");
        thread.start();
        t.start();
    }
}
