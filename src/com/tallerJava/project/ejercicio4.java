package com.tallerJava.project;

import java.util.Scanner;

public class ejercicio4 {

    static double calculateIVA(double productPrice) {
        int IVA = 21;
        double productIVA = ((productPrice * IVA) / 100);
        return productIVA;
    }

    public static void main(String[] args) {

        double productPrice;
        double calculatedIVA;

        System.out.println("Escriba el precio del producto antes de IVA");
        Scanner input = new Scanner(System.in);
        productPrice = Double.parseDouble(input.next());

        calculatedIVA = calculateIVA(productPrice);

        System.out.println("El IVA del producto ingresado es: " + calculatedIVA + " y el precio final del producto con IVA es " + (calculatedIVA + productPrice));

    }
}
