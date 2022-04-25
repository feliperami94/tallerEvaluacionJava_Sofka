package com.tallerJava.project;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio11 {

    static HashMap<Character, Integer> countVowels(String phrase) {
        HashMap<Character, Integer> countingVowels = new HashMap<>();
        countingVowels.put('a', 0);
        countingVowels.put('e', 0);
        countingVowels.put('i', 0);
        countingVowels.put('o', 0);
        countingVowels.put('u', 0);

        for (char c: phrase.toCharArray()) {
            switch(c){
                case 'a':
                case'e':
                case'i':
                case'o':
                case'u':
                countingVowels.replace(c, countingVowels.get(c) + 1);
            }
        }
        return countingVowels;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String buffer;
        int phraseSize, currentCharacterCount;
        char currentCharacter;
        HashMap<Character, Integer> countingVowels;


        System.out.println("Ingrese una frase para operar");
        buffer = input.nextLine().toLowerCase(Locale.ROOT);
        phraseSize = buffer.length();
        System.out.println("La frase tiene " + phraseSize + " caracteres incluyendo espacios y signos de puntuación");
        countingVowels = countVowels(buffer);
        System.out.println(countingVowels);
        }


    }