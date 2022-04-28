package com.tallerJava.project.ejercicio18;

public class Videojuegos implements Entregable{

    private static final String DEFAULT_TITULO = "Titulo Videojuego";
    private static final Integer DEFAULT_HORAS = 10;
    private static final Boolean DEFAULT_PRESTADO = false;
    private static final String DEFAULT_GENERO = "Género Videojuego";
    private static final String DEFAULT_COMPANIA = "Compañía Desarrolladora Videojuego";




    private String titulo = DEFAULT_TITULO;
    private Integer horasEstimadas = DEFAULT_HORAS;
    private Boolean prestado = DEFAULT_PRESTADO;
    private String genero = DEFAULT_GENERO;
    private String compania = DEFAULT_COMPANIA;

    public Videojuegos(){}

    public Videojuegos(String titulo, Integer horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuegos(String titulo, Integer horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;

    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(Integer horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        String returnString = "El juego se llama " + this.titulo + ", se completa en " + this.horasEstimadas + " horas, y lo desarrolla " + this.compania;

        return returnString;

    }


    @Override
    public void entregar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.prestado;
    }

    @Override
    public String compareTo(Object a) {
        Videojuegos videogameComp = (Videojuegos) a;
        int comparacion = this.horasEstimadas - videogameComp.horasEstimadas;
        String response ="";
        if (comparacion < 0){
           response =  "El juego " + this.titulo + " es " + Math.abs(comparacion) + " hora(s) mas corto que el juego " + videogameComp.titulo;
        } else if (comparacion == 0){
            response = "Los juegos tienen las mismas horas estimadas";
        } else {
            response =  "El juego " + this.titulo + " es " + comparacion + " hora(s) mas largo que el juego " + videogameComp.titulo;
        }
        return response;
    }


}

