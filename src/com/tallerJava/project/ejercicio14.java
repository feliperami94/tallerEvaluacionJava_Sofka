package com.tallerJava.project;

import javax.swing.*;

public class ejercicio14 {

    static void runUntilThousand(int input) {
        while(input <= 1000) {
            System.out.println(input);
            input+=2;
        }
    }

    public static void main(String[] args) {
        String inputString = JOptionPane.showInputDialog("Ingrese un numero entero menor que 1000");
        int inputInteger = Integer.parseInt(inputString);

        runUntilThousand(inputInteger);
    }


}
