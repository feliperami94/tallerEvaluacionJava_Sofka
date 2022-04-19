package com.tallerJava.project;

import javax.swing.*;
import java.util.Scanner;

public class ejercicio14 {

    static void runUntilThousand(int input) {
        while(input <= 1000) {
            System.out.println(input);
            input+=2;
        }
    }

    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero menor que 1000");
        Scanner input = new Scanner(System.in);
        String buffer = input.nextLine();
        int inputInteger = Integer.parseInt(buffer);

        runUntilThousand(inputInteger);
    }


}
