package javaExercises.chapter1;
//package Utils;

import java.util.Scanner;

public class SwapTwoVariablesWithThirdVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Citim variabila a de la tastatura: ");
        int a = input.nextInt();
        System.out.println("Citim variabila b de la tastatura: ");
        int b = input.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("Variabila a are noua valoare " + a);
        System.out.println("Variabila b are noua valoare " + b);
    }
}
