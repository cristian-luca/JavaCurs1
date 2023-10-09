package javaExercises.chapter3;

import javaExercises.modificatoriacces.Animal;
import javaExercises.modificatoriacces.Elefant;
import javaExercises.modificatoriacces.Tigru;

public class RunAnimal extends Animal {
    public static void main(String[] args) {
//        Tigru tigru = new Tigru();
//        tigru.apelareAlearga();
//        tigru.seJoacaCuTrompa();
//        RunAnimal runAnimal = new RunAnimal();
//        runAnimal.alearga();
//        runAnimal.mananca();
        Elefant elefant1 = new Elefant();
        System.out.println(elefant1.VARSTA);
        Elefant elefant2 = new Elefant(10);
        System.out.println(elefant2.VARSTA);
        //elefant2.VARSTA = 500; java: cannot assign a value to final variable VARSTA

        /*
        Elefant elefant1 = new Elefant();
        System.out.println(elefant1.VARSTA);
        Elefant elefant2 = new Elefant(10);
        System.out.println(elefant2.VARSTA);
        //elefant2.VARSTA = 500; java: cannot assign a value to final variable VARSTA
         */


    }
}
