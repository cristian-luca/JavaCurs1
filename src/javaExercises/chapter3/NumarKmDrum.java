package javaExercises.chapter3;

import utils.Utils;

public class NumarKmDrum {
    /*
    Un automobil a parcurs 65% dintr-un drum si mai are de parcurs 70km.
    Cati km are intregul drum?
    65% * x + 70 = x;
     */
    public static void main(String[] args) {
        NumarKmDrum obj = new NumarKmDrum();
        System.out.print("Introdu ce procent a parcurs automobilul: ");
        double catAParcurs = Utils.scanner().nextDouble();
        catAParcurs /= 100.0;
        System.out.println();
        System.out.print("Introdu distanta ce a mai ramas de parcurs de catre automobil in km: ");
        double catMaiAreDeParcurs = Utils.scanner().nextDouble();
        System.out.println();
        System.out.println("Drumul are " + findKmDrum(catAParcurs, catMaiAreDeParcurs) +" km.");

    }

    public static double findKmDrum(double catAParcurs, double catMaiAreDeParcurs) {
        return catMaiAreDeParcurs / (1 - catAParcurs);
    }
}


