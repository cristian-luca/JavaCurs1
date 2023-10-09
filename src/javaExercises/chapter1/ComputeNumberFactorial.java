package javaExercises.chapter1;

import utils.Utils;

public class ComputeNumberFactorial {
    public static void main(String[] args) {
        System.out.println("Citeste de la tastatura un numar intreg: ");
        int number = Utils.scanner().nextInt();
        int i = 1;
        int f = 1;

        while(i <= number) {
            f *= i;
            i++;
        }
        System.out.println(number + " factorial reprezinta " + f);
    }
}
