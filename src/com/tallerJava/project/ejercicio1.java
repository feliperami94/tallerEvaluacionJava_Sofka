package com.tallerJava.project;

public class ejercicio1 {

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
        int num1 = 6;
        int num2 = 6;

        System.out.println(numComparison(num1, num2));

    }
}
