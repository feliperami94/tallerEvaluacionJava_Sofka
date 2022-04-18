package com.tallerJava.project;

public class ejercicio5 {

    public static String isEven(int num, int numberState){
        switch (numberState){
            case 0:
                return " - es par";
            default:
                return " - es impar";
        }
    }


    public static void main(String[] args) {
        int initialNumber = 1;
        int currentNumber = initialNumber;
        int finalNumber = 100;

        while (currentNumber <= finalNumber ){
            System.out.println(String.valueOf(currentNumber).concat(isEven(currentNumber, (currentNumber %2))));
            currentNumber++;
        }
    }
}
