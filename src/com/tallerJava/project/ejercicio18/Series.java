package com.tallerJava.project.ejercicio18;

public class Series implements Entregable{
    private static final String DEFAULT_TITULO = "Titulo por defecto";
    private static final Integer DEFAULT_TEMPORADAS = 3;
    private static final Boolean DEFAULT_PRESTADO = false;
    private static final String DEFAULT_GENERO = "Sin genero";
    private static final String DEFAULT_CREADOR = "Sin creador";


    private String titulo = DEFAULT_TITULO;
    private Integer temporadas = DEFAULT_TEMPORADAS;
    private Boolean prestado = DEFAULT_PRESTADO;
    private String genero = DEFAULT_GENERO;
    private String creador = DEFAULT_CREADOR;

    public Series() {
    }

    public Series(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Series(String titulo, Integer temporadas, String genero, String creador) {
        this.titulo = titulo;
        this.temporadas = temporadas;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        String returnString = "La serie " + this.titulo + " tiene " + this.temporadas + " temporadas, y es de " + this.genero;
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
        Series seriesComp = (Series) a;
        int comparacion = this.temporadas - seriesComp.temporadas;
        String response ="";
        if (comparacion < 0){
            response =  "La serie " + this.titulo + " es " + Math.abs(comparacion) + " temporada(s) mas corta que la serie " + seriesComp.titulo;
        } else if (comparacion == 0){
            response = "Las series tienen las temporadas";
        } else {
            response =  "La serie " + this.titulo + " es " + comparacion + " temporada(s) mas larga que la serie " + seriesComp.titulo;
        }
        return response;
    }
}
