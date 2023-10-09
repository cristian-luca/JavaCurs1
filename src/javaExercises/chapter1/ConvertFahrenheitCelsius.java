package javaExercises.chapter1;

import utils.Utils;

public class ConvertFahrenheitCelsius {
    public static void main(String[] args) {
        System.out.println("Citim valoarea temperaturii in Fahrenheit de la tastatura: ");
        double fahrenheit = Utils.scanner().nextDouble();
        double celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Valoarea temperaturii in Celsius este: " + celsius);
    }
}
