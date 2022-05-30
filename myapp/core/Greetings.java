package myapp.core;

import java.io.Console;


public class Greetings {
    //entry point
    public static void main(String[] args) {
    //get the console
        Console cons = System.console();
    //read from input
        String name = cons.readLine("What is your name?");
        if (name.length()>0) {
            System.out.printf("Hello %s\n",name);
        } else {
            System.err.println("You have not told me your name");
        }
        // System.out.printf("Hello %s. Please to meet you.\nYou are %d years old", name,10);
    }
}
