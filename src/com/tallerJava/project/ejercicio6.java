package com.tallerJava.project;

public class ejercicio6 {

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
        int finalNumber = 100;

        for (int i = initialNumber; i <= finalNumber; i++){
            System.out.println(String.valueOf(i).concat(isEven(i, (i % 2))));
        }
    }

}
