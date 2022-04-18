package com.tallerJava.project;

import java.util.Scanner;

public class ejercicio3 {

    static double calcArea(double radio){
        double area = Math.PI *(Math.pow(radio, 2));
        return area;
    }

    public static void main(String[] args) {
        double radio;
        double area;

        System.out.println("Ingrese el radio del circulo");
        Scanner input = new Scanner(System.in);
        radio = Double.parseDouble(input.next());
        System.out.println("El area del circulo es: "+ calcArea(radio));


    }
}
