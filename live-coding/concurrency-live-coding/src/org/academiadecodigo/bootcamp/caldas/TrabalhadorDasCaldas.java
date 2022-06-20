package org.academiadecodigo.bootcamp.caldas;

public class TrabalhadorDasCaldas implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("TRABALHADOR DAS CALDAS: Tô aqui a fazer uma loiça....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
        System.out.println("TRABALHADOR DAS CALDAS: Hoje já não faço mais caralho nenhum");
    }
}
