package javaExercises.chapter2SkillBrain;

import utils.Utils;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println("Introduceti un numar de la tastatura: ");
        int number = Utils.scanner().nextInt();
        System.out.println("Generati in mod aleatoriu un numar intre 1 si 100: ");
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println(randomNumber);

        if (number < randomNumber) {
            System.out.println("Numarul introdus este mai mic decat " + randomNumber);
        }
    }
}

    /*
    Cititi un numar de la tastatura si stocati valoarea lui intr-o variabila.
    Generati un numar random intre 1 si 100 si stocati acel numar
    intr-o alta variabila. Daca numarul introdus de la tastatura
    este mai mic decat numarul random generat, afisati mesajul
    “Numarul introdus este mai mic decat <numar_random>”
    (inserati valoarea numarului random generat in textul afisat).
     */