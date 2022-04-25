package com.tallerJava.project.ejercicio16;

import javax.swing.*;
import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {

        String inputName = JOptionPane.showInputDialog("Ingrese su nombre: ");
        short inputAge = (short) Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        String inputDNI = JOptionPane.showInputDialog("Ingrese su DNI: ");
        Character inputGender = JOptionPane.showInputDialog("Ingrese su genero: ").charAt(0);
        Double inputWeight = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso: "));
        Double inputHeight = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura: "));

        Persona person1 = new Persona(inputName, inputAge, inputDNI,inputGender, inputWeight, inputHeight);
        Persona person2 = new Persona(inputName, inputAge, inputGender);
        Persona person3 = new Persona();
        person3.setNombre("Carlos Rodriguez");
        person3.setEdad((short) 18);
        person3.setDNI("64874702D");
        person3.setSexo('H');
        person3.setPeso(70.1);
        person3.setAltura(1.63);

        System.out.println("La persona 1 llamada " + person1.getNombre() + " tiene indice de masa corporal" + person1.calcularIMC());
        System.out.println("La persona 2 llamada " + person2.getNombre() + " tiene indice de masa corporal" + person2.calcularIMC());
        System.out.println("La persona 3 llamada " + person3.getNombre() + " tiene indice de masa corporal" + person3.calcularIMC());

        System.out.println("La persona 1 llamada " + person1.getNombre() + " es mayor de edad?: " + person1.esMayorDeEdad());
        System.out.println("La persona 2 llamada " + person2.getNombre() + " es mayor de edad?: " + person2.esMayorDeEdad());
        System.out.println("La persona 3 llamada " + person3.getNombre() +  " es mayor de edad?: " + person3.esMayorDeEdad());

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);


    }

}
