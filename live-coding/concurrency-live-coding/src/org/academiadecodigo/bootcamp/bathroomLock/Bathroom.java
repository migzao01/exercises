package org.academiadecodigo.bootcamp.bathroomLock;

public class Bathroom {

    private Toilet toilet;

    public Bathroom(Toilet toilet){
        this.toilet = toilet;
    }

    public synchronized void enter() {



            System.out.println("knocks and sees if there is someone in there");

            System.out.println(Thread.currentThread().getName() + " entering toilet");
            toilet.use();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " leaving toilet");
        }

}
