package javaExercises.chapter1;

import utils.Utils;

public class Calculator {
    static String charTastatura;
    static double num1;
    static double num2;

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.enterTwoNumbersCalculateUntilPress_q();

    }


    //Acesta clasa nu are variabile de instanta
    //Java va crea un constructor by default

    public static double suma(double x, double y) {
        return x + y;

    }

    public static double produs(double x, double y) {
        return x * y;

    }

    public static double impartire(double x, double y) {
        return x / y;
    }

    public static double diferenta(double x, double y) {
        return x - y;
    }

    public static void enterTwoNumbersCalculateUntilPress_q() {
        do {
            System.out.println("Sa introduci de la tastatura caracterul q (q litera mica, de la quit) daca vrei sa iesi din program: ");
            charTastatura = String.valueOf(Utils.scanner().next().charAt(0));

            if (charTastatura.equals("q")) {
                break;
            } else {
                System.out.println("Ai ales sa nu apesi tasta cu litera mica q. Sa vedem ce se intampla!");
                System.out.println("Sa introduci primul numar fractionar: ");
                num1 = Utils.scanner().nextDouble();
                System.out.println("Sa introduci al doilea numar fractionar: ");
                num2 = Utils.scanner().nextDouble();
                System.out.println(num1 + " + " + num2 + " = " + suma(num1, num2));
                System.out.println(num1 + " - " + num2 + " = " + diferenta(num1, num2));
                System.out.println(num1 + " * " + num2 + " = " + produs(num1, num2));
                System.out.println(num1 + " / " + num2 + " = " + impartire(num1, num2));
                System.out.println("Again please!");
            }

        } while (true);
    }

}
