package org.example;

public class ex1 {
    public static void main(String[] args) {
        double[] temperature= {31.20,19.28,32.23,25.13,26.22,25.45,27.10};
        double highestTemperature=temperature[0];
        double lowestTemperature=temperature[0];
        for (int i = 1; i < temperature.length; i++) {
            if (temperature[i]>highestTemperature){
                highestTemperature=temperature[i];
            }
            if (temperature[i]<lowestTemperature){
                lowestTemperature=temperature[i];
            }

        }
        System.out.println("The highest temperature is " + highestTemperature);
        System.out.println("The lowest temperature is " + lowestTemperature);
    }
}
