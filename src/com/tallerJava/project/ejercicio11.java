package com.tallerJava.project;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio11 {

//    static

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String buffer;
//        int phraseSize, currentCharacterCount;
//        char currentCharacter;

        HashMap<Character, Integer> countingVowels = new HashMap<>();
        countingVowels.put('a', 0);
        countingVowels.put('e', 0);
        countingVowels.put('i', 0);
        countingVowels.put('o', 0);
        countingVowels.put('u', 0);


        System.out.println("Ingrese una frase para operar");
//        buffer = input.nextLine().toLowerCase(Locale.ROOT);
//        phraseSize = buffer.length();

//        for (int i = 0; i <= (phraseSize - 1); i++) {
//            currentCharacter = buffer.charAt(i);
//
//            switch (currentCharacter) {
//                case 'a':
//                    currentCharacterCount = countingVowels.get('a');
//                    countingVowels.replace('a', currentCharacterCount + 1);
//                    break;
//                case 'e':
//                    currentCharacterCount = countingVowels.get('e');
//                    countingVowels.replace('e', currentCharacterCount + 1);
//                    break;
//                case 'i':
//                    currentCharacterCount = countingVowels.get('i');
//                    countingVowels.replace('i', currentCharacterCount + 1);
//                    break;
//                case 'o':
//                    currentCharacterCount = countingVowels.get('o');
//                    countingVowels.replace('o', currentCharacterCount + 1);
//                    break;
//                case 'u':
//                    currentCharacterCount = countingVowels.get('u');
//                    countingVowels.replace('u', currentCharacterCount + 1);
//                    break;
//            }
//        }
        System.out.println(countingVowels);

    }
}
