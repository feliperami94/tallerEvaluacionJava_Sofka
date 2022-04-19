package com.tallerJava.project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ejercicio13 {


    public static void main(String[] args) {
        LocalDateTime fechaTiempo1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
        String formatDateTime = fechaTiempo1.format(formatter);
        String result = "La fecha y hora actual es: ";
        result = result.concat(formatDateTime);

        System.out.println(result);
    }
}
