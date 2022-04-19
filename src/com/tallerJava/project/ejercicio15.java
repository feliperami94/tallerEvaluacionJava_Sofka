package com.tallerJava.project;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userOption = "";
        Boolean flag = true;
        while(flag){
            System.out.println("Ingrese un número correspondiente a la opción que desee escoger del siguiente menú");
            System.out.println("****** GESTION CINEMATOGRÁFICA ********");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6- VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            userOption = input.nextLine();

            switch (userOption){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                    continue;
                case "8":
                    System.out.println("Escogiste la salida");
                    flag = false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }

    }
}
