package com.tallerJava.project;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String buffer, resultado = "";

        System.out.println("Ingrese un dia de la semana sin tildes");
        buffer = input.next().toLowerCase(Locale.ROOT);

        switch (buffer) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                resultado = " es dia laboral";
                break;
            case "sabado":
            case "domingo":
                resultado = " no es dia laboral";
                break;
            default:
                resultado = " - no se reconoció el día";
                break;
        }
        System.out.println(buffer.concat(resultado));
    }
}
