package com.tallerJava.project;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;

        do {
            System.out.println("Ingrese un numero entero mayor que cero: ");
            numInput = Integer.parseInt(input.next());

        } while (numInput < 0);
        System.out.println("El numero ingresado es: " + numInput);
    }



}
