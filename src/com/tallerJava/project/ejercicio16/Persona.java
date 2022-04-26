package com.tallerJava.project.ejercicio16;

public class Persona {
    private final char HOMBRE = 'H';

    private String nombre = "";
    private short edad = 0;
    private String DNI;
    private Character sexo = HOMBRE;
    private double peso = 0.0;
    private double altura = 0.0;

    public Persona(){
        this.DNI = generaDNI();
    }

    public Persona(String nombre, short edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = generaDNI();
    }

    public Persona(String nombre, short edad,String DNI, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }



    public String calcularIMC(){
        final int imcBelow = -1;
        final int imcIdeal = 0;
        final int imcAbove = 1;
        int imcResponse;

        double calcIMC = peso/(Math.pow(altura, 2));

        if(calcIMC < 20){
            imcResponse = imcBelow;
        } else if (calcIMC > 25){
          imcResponse = imcIdeal;
        } else {
          imcResponse = imcAbove;
        }
        return String.valueOf(imcResponse) + interpretIMCIndex(imcResponse);
    }

    public String interpretIMCIndex(Integer index){
        String interpretacion = "";
        switch (index) {
            case -1:
                interpretacion = ", lo que indica que la persona está por debajo del peso ideal";
                break;
            case 0:
                interpretacion = ", lo que indica que la persona está en el rango del peso ideal";
                break;
            case 1:
                interpretacion = ", lo que indica que la persona está por encima del peso ideal";

        }
        return interpretacion;
    }


    public boolean esMayorDeEdad(){
        return edad > 17;
    }

    private boolean comprobarSexo(char guessSex){
        boolean response = false;

        if (guessSex != 'H' && guessSex != 'M'){
            guessSex = 'H';
        }
        if (guessSex == sexo){
            response = true;
        }
        return response;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private String generaDNI(){
        double randomNumber = Math.random();
        Integer generatedDNINumber = (int)(randomNumber * 100000000);
        String DNINumberToString = Integer.toString(generatedDNINumber);
        char DNILetra = generaDNILetra(generatedDNINumber);
        return DNINumberToString + DNILetra;
    }

    private char generaDNILetra(Integer number){
        int sumNumbers = 0;
        int ascii = 0;
        for (int i = 1; i<=8; i++){
            sumNumbers += number % 10;
            number = (int) number / 10;
        }
        ascii = (int)((sumNumbers/72)*25)+65;
        return (char) ascii;
    }

}
