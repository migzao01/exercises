package org.academiadecodigo.shellbys;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Main {


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,10,800,800);
        rectangle.setColor(Color.PINK);
        rectangle.fill();

        MyDude myDude = new MyDude();
        myDude.init();


        MachineGun machineGun = new MachineGun();
        machineGun.init();
    }
}
