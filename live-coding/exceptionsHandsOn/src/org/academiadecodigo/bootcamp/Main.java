package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.exceptions.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            FileManager fileManager = new FileManager(10);
            System.out.println("i'm inside try");
            fileManager.collectFile("batata");
            fileManager.collectFile("file1.txt");
            System.out.println("i'm also here");

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
            System.out.println("i'm inside catch");
        }


    }
}
