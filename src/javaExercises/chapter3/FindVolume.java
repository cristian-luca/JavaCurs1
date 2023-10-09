package javaExercises.chapter3;

import utils.Utils;

public class FindVolume {

    public static void main(String[] args) {
        FindVolume obj = new FindVolume();
        System.out.print("Enter lungimea rezervorului in metri: ");
        double lungimeRezervor = Utils.scanner().nextDouble();
        System.out.println();
        System.out.print("Enter latimea rezervorului in decimetri: ");
        double latimeRezervor = Utils.scanner().nextDouble();
        System.out.println();
        System.out.print("Enter inaltimea rezervorului in centimetri: ");
        double inaltimeRezervor = Utils.scanner().nextDouble();
        lungimeRezervor *= 10; //am transformat metri in decimetri
        inaltimeRezervor /= 10; //am transformat centimetri in decimetri
        double volumRezervor = obj.findVolume(lungimeRezervor, latimeRezervor, inaltimeRezervor);
        System.out.println("Volumul rezervorului de apa in litri este: " + volumRezervor);
        System.out.println("Numarul de sticle de 0.5l este: " + volumRezervor / 0.5);
    }

    public double findVolume(double lungime, double latime, double inaltime) {
        return lungime * latime * inaltime;
    }

    //am folosit de la tastatura valorile din powerpoint 0.3, 17 si 200.
}
