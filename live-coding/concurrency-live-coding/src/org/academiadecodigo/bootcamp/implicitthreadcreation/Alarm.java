package org.academiadecodigo.bootcamp.implicitthreadcreation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

public class Alarm {

    private Timer timer;

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Number of times to ring:");
        try {
            int numOfRings = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Ring interval in seconds:");
            int ringInterval = Integer.parseInt(bufferedReader.readLine());

            System.out.println(Thread.currentThread().getName());

            Alarm alarm = new Alarm();
            Alarm beatrizAlarm = new Alarm();
            alarm.start(numOfRings, ringInterval);
            beatrizAlarm.start(numOfRings, ringInterval);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void start(int numOfRings, int ringInterval){
        timer = new Timer();
        timer.scheduleAtFixedRate(new Ring(numOfRings), ringInterval * 1000, ringInterval * 1000);
    }

    private class Ring extends TimerTask {

        private int numOfRings;

        public Ring(int numOfRings) {
            this.numOfRings = numOfRings;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": Alarm is ringing...");

            numOfRings--;

            if(numOfRings == 0) {
                System.out.println(Thread.currentThread().getName() + ": Alarm was cancelled");
                stop();
            }
        }

        private void stop(){
            timer.cancel();
        }
    }
}
