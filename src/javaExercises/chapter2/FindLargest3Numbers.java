package javaExercises.chapter2;

import utils.Utils;

public class FindLargest3Numbers {
    public static void main(String[] args) {
        System.out.println("Sa introduci primul numar intreg: ");
        int num1 = Utils.scanner().nextInt();
        System.out.println("Sa introduci al doilea numar intreg: ");
        int num2 = Utils.scanner().nextInt();
        System.out.println("Sa introduci al treilea numar intreg: ");
        int num3 = Utils.scanner().nextInt();
        System.out.println("Cel mai mare dintre cele trei numere este " +  FindLargest2Numbers (num1, FindLargest2Numbers (num2, num3)));

    }
    public static int FindLargest2Numbers (int x, int y) {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }
}
//Math.max() poate fi folosita.