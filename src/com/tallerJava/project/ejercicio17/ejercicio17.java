package com.tallerJava.project.ejercicio17;

public class ejercicio17 {

    public static void main(String[] args) {
        Electrodomestico[] electrodomesticArray = new Electrodomestico[10];

        electrodomesticArray[0] = new Lavadora();
        electrodomesticArray[1] = new Television();
        electrodomesticArray[2] = new Lavadora(650.0, 25.0);
        electrodomesticArray[3] = new Television(380.0, 12.0);
        electrodomesticArray[4] = new Lavadora(810.0, "RED", 'E', 35.0, 20.0);
        electrodomesticArray[5] = new Television(38, false, 1230.0, "BLACK", 'B', 36.0);
        electrodomesticArray[6] = new Electrodomestico(760.0, 42.0);
        electrodomesticArray[7] = new Electrodomestico(495.0, "GREEN", 'A', 21.0);
        electrodomesticArray[8] = new Lavadora(1820.0, "ORANGE", 'R', 75.0, 85.0);
        electrodomesticArray[9] = new Television(47, true, 1550.0, "BLUE", 'F', 42.0);

        Double sumPriceWashingMachine = 0.0;
        Double sumPriceTelevision = 0.0;
        Double sumPriceElectrodomestic = 0.0;

        for (Electrodomestico device: electrodomesticArray){
            Double devicePrice = device.precioFinal();
            if (device instanceof Lavadora){
                System.out.println("Lavadora con precio de: $" + String.valueOf(devicePrice));
                sumPriceWashingMachine += devicePrice;
            } else if (device instanceof  Television){
                System.out.println("Televisor con precio de: $" + String.valueOf(devicePrice));
                sumPriceTelevision += devicePrice;
            } else {
                System.out.println("Electrodomestico con precio de: $" + String.valueOf(devicePrice));
                sumPriceElectrodomestic += devicePrice;
            }
        }
        System.out.println("La suma de las lavadoras listadas es de: $" + String.valueOf(sumPriceWashingMachine));
        System.out.println("La suma de los televisores listados es de: $" + String.valueOf(sumPriceTelevision));
        System.out.println("La suma de los electrodomesticos genéricos listados es de: $" + String.valueOf(sumPriceElectrodomestic));
        System.out.println("El total de los electrodomesticos listados (incluidos TVs y Lavadoras) es de: $" + String.valueOf(sumPriceElectrodomestic + sumPriceWashingMachine + sumPriceTelevision));






    }
}
