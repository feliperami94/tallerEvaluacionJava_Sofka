package com.tallerJava.project.ejercicio18;

public class ejercicio18 {

    public static void main(String[] args) {

        Series[] seriesArray = new Series[5];
        Videojuegos[] juegosArray = new Videojuegos[5];

        seriesArray[0] = new Series();
        seriesArray[1] = new Series("El gusto por programar", "Felipe Ramirez");
        seriesArray[2] = new Series("Los gatos locos", 4, "Comedia", "Laura Morales");
        seriesArray[3] = new Series("De la vez que me quebré montando tabla", "Carlos Rodríguez");
        seriesArray[4] = new Series("Mr. Robot", 2, "Acción", "John Lennon");

        juegosArray[0] = new Videojuegos();
        juegosArray[1] = new Videojuegos("Mario Bros", 10);
        juegosArray[2] = new Videojuegos("Assasins Creed", 100, "Accion", "La America Games");
        juegosArray[3] = new Videojuegos("Soccer 2022", 80);
        juegosArray[4] = new Videojuegos("Pepsi man", 65, "Aventura", "Pepsi company");

        seriesArray[1].entregar();
        seriesArray[3].entregar();

        juegosArray[0].entregar();
        juegosArray[2].entregar();

        int contadorSeriesEntregadas;
        int contadorJuegosEntregados;
        int serieMasLarga;
        int juegoMasLargo;

        serieMasLarga = serieMasTemporadas(seriesArray);
        juegoMasLargo = juegoMasHoras(juegosArray);
        contadorSeriesEntregadas = seriesEntregadas(seriesArray);
        contadorJuegosEntregados = juegosEntregados(juegosArray);

        int totalItemsEntregados = contadorJuegosEntregados + contadorSeriesEntregadas;
        System.out.println("El total de series entregadas es " + contadorSeriesEntregadas);
        System.out.println("El total de videojuegos entregados es " + contadorJuegosEntregados);
        System.out.println("El total de articulos entregados es " + totalItemsEntregados);

        System.out.println("Serie con más temporadas: " + seriesArray[serieMasLarga].toString());
        System.out.println("Juego con más horas estimadas: " + juegosArray[juegoMasLargo].toString());
    }

    public static int seriesEntregadas(Series[] seriesArray){
        int contadorSeriesEntregadas =0;
        for (int i = 0; i <= 4; i++){
            if (seriesArray[i].isEntregado()){
                contadorSeriesEntregadas += 1;
                System.out.println("Serie entregada: " + seriesArray[i].toString());
            }
        }
        return contadorSeriesEntregadas;
    }

    public static int juegosEntregados(Videojuegos[] juegosArray){
        int contadorJuegosEntregados = 0;
        for (int i = 0; i <= 4; i++){
            if (juegosArray[i].isEntregado()){
                contadorJuegosEntregados += 1;
                System.out.println("Juego entregado: " + juegosArray[i].toString());
            }
        }
        return contadorJuegosEntregados;
    }

    public static int serieMasTemporadas(Series[] seriesArray){
        int serieMasLarga = 0;
        for (int i = 0; i <= 4; i++){
            if (seriesArray[i].getTemporadas() >= seriesArray[serieMasLarga].getTemporadas()){
                serieMasLarga = i;
            }
        }
        return serieMasLarga;
    }

    public static int juegoMasHoras(Videojuegos[] juegosArray){
        int juegoMasLargo = 0;
        for (int i = 0; i <= 4; i++){
            if (juegosArray[i].getHorasEstimadas() >= juegosArray[juegoMasLargo].getHorasEstimadas()){
                juegoMasLargo = i;
            }
        }
        return juegoMasLargo;
    }



}
