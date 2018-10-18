package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kbreader = new Scanner(System.in);

        System.out.println("Enter your word.");
        String input = kbreader.next();
        input.toUpperCase();

        if (input == "Exit") {
            System.exit(0);
        }

        else {
            String finish = input + "extra";

            String sp [] = new String[finish.length()];
            sp = finish.split("as");
            System.out.println(sp.length - 1);
        }

}}
