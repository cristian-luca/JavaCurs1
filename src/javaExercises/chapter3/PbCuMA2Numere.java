package javaExercises.chapter3;

import utils.Utils;

public class PbCuMA2Numere {
    public static void main(String[] args) {
        PbCuMA2Numere obj = new  PbCuMA2Numere();
        System.out.print("Introdu media aritmetica a doua numere: ");
        double mediaAritmeticaA2Numere = Utils.scanner().nextDouble();
        System.out.println();
        System.out.print("Introdu catul impartirii primului numar la al doilea: ");
        double catImpartire = Utils.scanner().nextDouble();
        System.out.println();
        System.out.print("Introdu restul impartirii primului numar la al doilea: ");
        double restImpartire = Utils.scanner().nextDouble();
        System.out.println();
        double temp = findAlDoileaNumar(mediaAritmeticaA2Numere, catImpartire, restImpartire);
        System.out.println("Al doilea numar este: " + temp);
        System.out.println("Primul numar este: " + (temp * catImpartire + restImpartire));
    }

    public static double findAlDoileaNumar(double mediaAritmeticaA2Numere, double catImpartire, double restImpartire) {
        return (2 * mediaAritmeticaA2Numere - restImpartire/(1 + catImpartire));
    }
}
