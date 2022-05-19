package org.academiadecodigo.bootcamp.oopdemo;

public class Playground {

    public static void main(String[] args) {

        Calculator myBeautifulCalculator = new Calculator("Casio", "Yellow");

        System.out.println("My calculator is a " + myBeautifulCalculator.askBrand() +
                " and is " + myBeautifulCalculator.askColor());

        myBeautifulCalculator.changeBrand("Knock off");

        System.out.println("My calculator is a " + myBeautifulCalculator.askBrand() +
                " and is " + myBeautifulCalculator.askColor());






    }
}
