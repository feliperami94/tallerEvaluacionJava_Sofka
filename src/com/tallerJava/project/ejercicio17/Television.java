package com.tallerJava.project.ejercicio17;

public class Television extends Electrodomestico {

    private static final int DEFAULT_RESOLUTION = 20;
    private static final boolean DEFAULT_TDTTUNER = false;

    public Integer resolution = DEFAULT_RESOLUTION;
    public Boolean tdtTuner = DEFAULT_TDTTUNER;

    public Television(){
        super();
    }

    public Television(Double price, Double weight){
        super(price, weight);
    }

    public Television(Integer resolution, Boolean tdtTuner, Double price, String color, Character energyConsumption, Double weight){
        super(price, color, energyConsumption, weight);
        this.resolution = resolution;
        this.tdtTuner = tdtTuner;
    }

    public Integer getResolution() {
        return resolution;
    }

    public Boolean getTdtTuner() {
        return tdtTuner;
    }

    public Double precioFinal(){
        Double finalPriceTV = super.precioFinal();

        if (this.resolution > 40){
            finalPriceTV = finalPriceTV * 1.30;
        }
        if (tdtTuner){
            finalPriceTV += 50.0;
        }
        return finalPriceTV;
    }


}
