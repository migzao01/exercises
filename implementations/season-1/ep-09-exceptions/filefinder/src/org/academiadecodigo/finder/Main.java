package org.academiadecodigo.finder;


import org.academiadecodigo.finder.exceptions.FileNotFoundException;

/**
 * Created by pantoninho on 22/05/16.
 */
public class Main {

    public static void main(String[] args) {

        try {
            FileManager fileManager = new FileManager(5);
            fileManager.getFile("test");
        }catch (FileNotFoundException message) {
            System.out.println(message.getMessage());
        }
    }

}
