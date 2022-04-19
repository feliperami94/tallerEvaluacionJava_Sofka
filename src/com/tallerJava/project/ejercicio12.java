package com.tallerJava.project;

import com.sun.deploy.util.StringUtils;


import java.util.Scanner;

public class ejercicio12 {

    static String compareWords(String word1, String word2){
        String baseString = word1;
        String comparingString = word2;
        if(word1.length() >= word2.length()){
            baseString = word2;
            comparingString = word1;
        }
        String[] substrings = baseString.split("");

        for (String character: substrings){
            comparingString = comparingString.replaceFirst(character, "");
        }

        return comparingString;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1, word2;
        String resultado;

        System.out.println("Ingrese una palabra:");
        word1 = input.nextLine().toLowerCase();
        System.out.println("Ingrese una segunda palabra:");
        word2 = input.nextLine().toLowerCase();

        resultado = "Las palabras son iguales";
        if (!word1.contentEquals(word2)){
            resultado = "Las palabras difieren en: ".concat(compareWords(word1, word2));
        }
        System.out.println(resultado);
        System.out.println("La diferencia la calculo tomando los caracteres de la palabra más larga que no están en la palabra más corta.");
        System.out.println("Si las palabras son de igual longitud, la diferencia son los caracteres en la segunda palabra que no están en la primera");


    }

}
