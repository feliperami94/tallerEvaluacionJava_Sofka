package com.tallerJava.project;

import java.util.Scanner;

public class ejercicio2 {

    static int numComparison(int num1, int num2) {
        int numMayor = num1;
        if (num2 > num1) {
            numMayor = num2;
        }
        return numMayor;
    }


    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Escribe un primer número");
        num1 = input.nextInt();
        System.out.println("Escribe un segundo número");
        num2 = input.nextInt();

        if (num1 == num2 ){
            System.out.println("Los numeros son iguales");
        }
        else {
            System.out.println("El numero mayor es: "+ numComparison(num1, num2));
        }

    }
}
