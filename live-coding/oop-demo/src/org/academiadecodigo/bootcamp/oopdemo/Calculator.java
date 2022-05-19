package org.academiadecodigo.bootcamp.oopdemo;

public class Calculator {

    private String brand;
    private String color;

    public Calculator(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public String askBrand() {
        return this.brand;
    }

    public String askColor() {
        return this.color;
    }

    public void changeBrand(String newBrand) {

        if (newBrand.equals("Knock off")) {
            System.out.println("No knock offs allowed.");
            return;
        }

        brand = newBrand;
    }
}
