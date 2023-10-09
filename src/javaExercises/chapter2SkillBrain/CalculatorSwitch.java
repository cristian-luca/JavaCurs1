package javaExercises.chapter2SkillBrain;

import utils.Utils;

public class CalculatorSwitch {
    static int number1, number2;
    static char charTastatura;

    public static void main(String[] args) {
        introducerePrimulNumarAlDoileaNumarUnCaracterAnume();
        switchCalculator();
    }

    public static void introducerePrimulNumarAlDoileaNumarUnCaracterAnume() {
        System.out.println("Introduceti primul numar de la tastatatura: ");
        number1 = Utils.scanner().nextInt(); //se poate folosi tipul double in loc de int
        System.out.println("Introduceti al doilea numar de la tastatatura: ");
        number2 = Utils.scanner().nextInt(); //se poate folosi tipul double in loc de int
        System.out.println("Introduceti unul dintre caracterele a, s, p, i, m de la tastatatura: ");
        charTastatura = Utils.scanner().next().charAt(0);
    }

    public static void switchCalculator() {
        switch (charTastatura) {
            case 'a':
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case 's':
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case 'p':
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case 'i':
                if (number2 != 0.0) {
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                } else {
                    System.out.println("Nu ai voie sa imparti la 0! La urmatoarea incercare sa alegi un impartitor nenul.");
                    // Este aruncata eroarea: Exception in thread main java.lang.ArithmeticException: / by zero.
                }
                break;
            case 'm':
                System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
                break;
            default:
                System.out.println("Ati introdus alt character decat vi s-a cerut. Nu pot efectua acest calcul!");
        }
    }
}
/*
Cititi un caracter si 2 numere de la tastatura, si stocati-le in variabile.
 Folosind structura switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu cele 2 numere, si afisati rezultatul pe ecran:
-‘a’: adaugare
-‘s’: scadere
-‘i’: inmultire
-‘p’: impartire
-‘m’: modul
Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
 */