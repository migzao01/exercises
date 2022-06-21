package org.academiadecodigo.bootcamp.bathroomLock;

public class Academia {

    public static void main(String[] args) {


        Bathroom bathroom = new Bathroom(new Toilet());

        Thread fulano = new Thread(new Cadet("Tomás", bathroom));
        Thread beltrano = new Thread(new Cadet("Alex", bathroom));
        Thread sicrano = new Thread(new Cadet("Vinicius", bathroom));

        fulano.start();
        beltrano.start();
        sicrano.start();
    }
}
