package com.tallerJava.project;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        String phrase = "La sonrisa sera la mejor arma contra la tristeza - ";
        String newPhrase = phrase.replaceAll("a", "e");

        System.out.println("Ingresa una nueva frase para ser concatenada a una frase modificada: ");
        Scanner input = new Scanner(System.in);
        String userPhrase = input.nextLine();
        System.out.println(newPhrase.concat(userPhrase));
    }
}
