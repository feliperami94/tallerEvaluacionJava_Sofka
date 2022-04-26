package com.tallerJava.project.ejercicio17;

import java.util.Arrays;

public class Electrodomestico {


    private static final double DEFAULT_PRICE = 100;
    private static final String[] COLORS_ARRAY = {"BLACK", "WHITE", "RED", "BLUE", "GRAY"};
    private static final String DEFAULT_COLOR = COLORS_ARRAY[1];
    private static final Character[] CONSUMPTION_ARRAY = {'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Character DEFAULT_ENERGY_CONSUMPTION = CONSUMPTION_ARRAY[5];
    private static final double DEFAULT_WEIGHT = 5.0;

    protected Double price = DEFAULT_PRICE;
    protected String color = DEFAULT_COLOR;
    protected Character energyConsumption = DEFAULT_ENERGY_CONSUMPTION;
    protected Double weight = DEFAULT_WEIGHT;

    protected Electrodomestico() {

    }

    protected Electrodomestico(Double price, Double weight){
        this.price = price;
        this.weight = weight;
    }

    protected Electrodomestico(Double price, String color, Character energyConsumption, Double weight) {
        this.price = price;
        this.color = checkColor(color);
        this.energyConsumption = checkConsumption(energyConsumption);
        this.weight = weight;

    }

    public Double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Character getEnergyConsumption() {
        return energyConsumption;
    }

    public Double getWeight() {
        return weight;
    }

    protected Character checkConsumption(Character consumption) {
        if (!Arrays.asList(CONSUMPTION_ARRAY).contains(consumption)) {
            consumption = DEFAULT_ENERGY_CONSUMPTION;
        }
        return consumption;
    }

    protected String checkColor(String color) {
        String colorValidation = color.toUpperCase();
        if (!Arrays.asList(COLORS_ARRAY).contains(colorValidation)) {
            colorValidation = DEFAULT_COLOR;
        }
        return colorValidation;
    }

    public Double precioFinal(){
        Double finalPrice = this.price + energyRatePrice() + weightRatePrice();
        return finalPrice;
    }

    public Integer energyRatePrice() {
        Integer energyRate;
        switch (this.energyConsumption) {
            case 'A':
                energyRate = 100;
                break;
            case 'B':
                energyRate = 80;
                break;
            case 'C':
                energyRate = 60;
                break;
            case 'D':
                energyRate = 50;
                break;
            case 'E':
                energyRate = 30;
                break;
            default:
                energyRate = 10;
        }
        return energyRate;
    }


    public Double weightRatePrice() {
        Double weightRate = 10.0;
        if (this.weight >= 20.0 && this.weight <= 49.0) {
            weightRate = 50.0;
        } else if (this.weight >= 50.0 && this.weight <= 79.0) {
            weightRate = 80.0;
        } else if (this.weight >= 80){
            weightRate = 100.0;
        }
        return weightRate;
    }

}