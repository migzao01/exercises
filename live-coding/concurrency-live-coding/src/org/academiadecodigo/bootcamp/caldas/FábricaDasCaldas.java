package org.academiadecodigo.bootcamp.caldas;

public class FábricaDasCaldas {
    public static void main(String[] args) {
        System.out.println("GERENTE: esperando esses caralhos estarem prontos");

        Thread t = new Thread(new TrabalhadorDasCaldas());
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {

        }

        System.out.println("GERENTE: Acabou caralhos por hoje");

    }
}
