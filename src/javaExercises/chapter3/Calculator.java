package javaExercises.chapter3;

import utils.Utils;

public class Calculator {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Sa introduci primul numar fractionar: ");
        double num1 = Utils.scanner().nextDouble();
        System.out.println("Sa introduci al doilea numar fractionar: ");
        double num2 = Utils.scanner().nextDouble();

        System.out.println(num1 + " + " + num2 + " = " + obj.suma(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + obj.diferenta(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + obj.produs(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + obj.impartire(num1, num2));
    }


    //Acesta clasa nu are variabile de instanta
    //Java va crea un constructor by default

    public double suma(double x, double y) {
        return x + y;

    }

    public double produs(double x, double y) {
        return x * y;

    }

    public double impartire(double x, double y) {
        return x / y;
    }

    public double diferenta(double x, double y) {
        return x - y;
    }
}
