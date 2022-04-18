package com.tallerJava.project;

public class ejercicio1 {

    static int numComparison(int num1, int num2) {
        int numMayor = num1;
        if (num2 > num1) {
            numMayor = num2;
        }
        return numMayor;
    }


    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        if (num1 == num2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("El numero mayor es: " + numComparison(num1, num2));
        }

    }
}
