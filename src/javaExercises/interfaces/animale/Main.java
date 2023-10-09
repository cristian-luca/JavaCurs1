package javaExercises.interfaces.animale;

public class Main {
    public static void main(String[] args) {
        Urs urs = new Urs();
        Elefant elefant = new Elefant();
        Crocodil crocodil = new Crocodil();
        urs.culoare();
        urs.sunet();
        urs.tipDeMancare();
        System.out.println("=================");
        elefant.culoare();
        elefant.sunet();
        elefant.tipDeMancare();
        elefant.jungla();
        elefant.jungla();
        System.out.println("=================");
        crocodil.culoare();
        crocodil.sunet();
        crocodil.tipDeMancare();
    }
}
