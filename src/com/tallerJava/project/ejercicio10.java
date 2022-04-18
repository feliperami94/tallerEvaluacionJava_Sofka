package com.tallerJava.project;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String buffer, bufferNoSpaces;

        System.out.println("Ingrese una frase para ser modificada: ");
        buffer = input.nextLine();
        bufferNoSpaces = buffer.replaceAll(" ", "");

        System.out.println(bufferNoSpaces);

    }
}
