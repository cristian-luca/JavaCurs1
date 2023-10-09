package javaExercises.chapter1SkillBrain;

import utils.Utils;

public class TemaJavaBasicsPart1 {
    //static Scanner input;

    public static void main(String[] args) {
        //1. Scrieti un program care afiseaza “Imi place Java”
        afiseazaText("Imi place Java");
        System.out.println("= = = = = = = = = = = = = = = = =");
        //2. Scrieti un program care afiseaza de 6 ori propozitia
        //“Cursul acesta este foarte fain!”
        afiseaza6OriText("Cursul acesta este foarte fain!");
        System.out.println("= = = = = = = = = = = = = = = = =");
        //3. Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic.
        //Scrieti un program care afiseaza varsta lui David.;
        varstaDavid(24);
        System.out.println("= = = = = = = = = = = = = = = = =");
        //4. Scrieti un program in care cititi o propozitie de la
        //tastatura
        citirePropozitieTastatura();
        System.out.println("= = = = = = = = = = = = = = = = =");
        //. Scrieti un program in care definiti 3 variabile in metoda       // “myVariables”, un int, un String si un boolean, apoi apelati
        //metoda din metoda “main”
        def3Variabile();
        System.out.println("= = = = = = = = = = = = = = = = =");
        //6. Scrieti un program in care creati o metoda unde cititi 2       //numere de la tastatura, le stocati in variabile, si dupa ce       //le-ati citit, afisati-le pe ecran.
        citire2NrTastaturaAfisare();
        System.out.println("= = = = = = = = = = = = = = = = =");
  /*
  7. Scrieti un program incare cititi de la tastatura un numar, si calculati:
        - rezultatul sumei cu 5
        - rezultatul scaderii cu 12.3
        - rezultatul inmultirii cu -3.2
        - rezultatul impartirii cu 4
        - rezultatul modulului cu 6
        */
        citireNumarTastaturaCalcul();
        System.out.println("= = = = = = = = = = = = = = = = =");
    /*
    8. Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa
fie 12 si 2:
public class Solution {
                        public static void main(String[] args) {
                                    int x = 2;
                                    int y = 12;
                                    // y = x * y;
                                    // y = x + y;
                                    x = y - x;
                                    y = y - x;
                                    System.out.println(x);
                                    System.out.println(y);
                        }
}
    */
        deleteOneCommentDisplay12Si2();
    }

    public static void afiseazaText(String text) {
        System.out.println(text);
    }

    public static void afiseaza6OriText(String text) {
        for (int i = 1; i < 7; i++) {
            System.out.println(text);
        }
    }

    public static void varstaDavid(int varstaAna) {
        System.out.println("Varsta lui David este: " + (varstaAna - 6));
    }

    public static void citirePropozitieTastatura() {
        //input = new Scanner(System.in);
        System.out.println("Introduceti o propozitie de la tastatura: ");
        String numeleVarCitPropTast = Utils.scanner().nextLine();
        System.out.println(numeleVarCitPropTast);
    }

    public static void def3Variabile() {
        int counterJava;
        String nameMentor;
        boolean ifPrimeNumber;
        System.out.println("Aici au fost initializate 3 variabile de tipuri diferite");
    }

    public static void citire2NrTastaturaAfisare() {
        //input = new Scanner(System.in);
        System.out.println("Introduceti doua numere de la tastatura: ");
        double numar1 = Utils.scanner().nextDouble();
        double numar2 = Utils.scanner().nextDouble();
        System.out.println("Primul numar este: " + numar1 + " si al doilea numar este: " + numar2 + ".");
    }

    public static void citireNumarTastaturaCalcul() {
        //input = new Scanner(System.in);
        System.out.println("Introduceti un numar de la tastatura: ");
        double numar = Utils.scanner().nextDouble();
        System.out.println("rezultatul sumei cu 5 este :" + (numar + 5));
        System.out.println("rezultatul scaderii cu 12.3 este:" + (numar - 12.3));
        System.out.println("rezultatul inmultirii cu -3.2 este:" + (numar * (-3.2)));
        System.out.println("rezultatul impartirii cu 4 este:" + (numar / 4));
        System.out.println("ezultatul modulului cu 6 este:" + (numar % 6));
    }

    public static void deleteOneCommentDisplay12Si2() {
        int x = 2;
        int y = 12;
        // y = x * y;
        y = x + y;
        x = y - x;
        y = y - x;
        System.out.println(x);
        System.out.println(y);
    }
}
