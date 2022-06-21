package org.academiadecodigo.bootcamp.bathroomLock;

public class Cadet implements Runnable {
    private String name;
    private Bathroom wc;

    public Cadet(String name, Bathroom wc) {
        this.name = name;
        this.wc = wc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        wc.enter();
    }
}
