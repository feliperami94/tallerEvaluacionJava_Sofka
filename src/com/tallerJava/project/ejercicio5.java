package com.tallerJava.project;

public class ejercicio5 {

    public static String isEven(int num){
        String numberState = " - es impar";
        if (num % 2 == 0) {
            numberState = " - es par";
        }
        return numberState;
    }


    public static void main(String[] args) {
        int initialNumber = 1;
        int currentNumber = initialNumber;
        String printingLine = "";
        int finalNumber = 100;

        while (currentNumber <= finalNumber ){
            printingLine = String.valueOf(currentNumber) + isEven(currentNumber);
            System.out.println(printingLine);
            currentNumber++;
        }
    }
}
