package javaExercises.inheritance;

public class Dacia extends Autovehicul{

    public void model() {
        System.out.println("Modelul este Logan.");
    }

    public void tractiune() {
        System.out.println("Avem tractiune fata.");
    }

    @Override
    public void franare() {
        System.out.println("Dacia nu franeaza bine.");
    }
}
