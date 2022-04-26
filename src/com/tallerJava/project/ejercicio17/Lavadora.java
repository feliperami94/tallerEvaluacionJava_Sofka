package com.tallerJava.project.ejercicio17;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Lavadora extends Electrodomestico{
    private static final double DEFAULT_CARGA = 5.0;


    public Double load = DEFAULT_CARGA;

    public Lavadora(){
        super();
    }

    public Lavadora(Double price, Double weight) {
        super(price, weight);
    }

    public  Lavadora(Double price, String color, Character energyConsumption, Double weight, Double load){
        super(price, color,  energyConsumption,  weight);
        this.load = load;
    }

    public Double getLoad() {
        return load;
    }

    public  Double precioFinal(){
        Double finalPriceWashing = super.precioFinal();
        if(this.load > 30.0){
            finalPriceWashing += 50;
        }
        return finalPriceWashing;
    }



}
