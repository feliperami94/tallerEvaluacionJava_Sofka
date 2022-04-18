package com.tallerJava.project;

import java.util.Scanner;

public class ejercicio2 {

    static String numComparison(int num1, int num2) {
        if (num1 > num2) {
            return "El numero mayor es " + num1;
        }
        if (num2 > num1) {
            return "El numero mayor es " + num2;
        }
        return "Los numeros son iguales";
    }


    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Escribe un primer número");
        num1 = input.nextInt();
        System.out.println("Escribe un segundo número");
        num2 = input.nextInt();

        System.out.println(numComparison(num1, num2));

    }
}
