package org.academiadecodigo.shellbys;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Shellbys <3");

        Prompt prompt = new Prompt(System.in, System.out);

        StringInputScanner hello = new StringInputScanner();
        hello.setMessage("WHAT ARE WE????");
        System.out.println(prompt.getUserInput(hello));
    }
}
