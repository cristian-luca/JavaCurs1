package javaExercises.chapter1;


import utils.Utils;

public class CheckOddEvenNumber {
    public static void main(String[] args) {
        System.out.println("Citim o valoare de la tastatura ");
        int a = Utils.scanner().nextInt();
        if (a % 2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }
    }

}
