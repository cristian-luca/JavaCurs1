package javaExercises.interfaces;

public class AntrenorHandbal implements Antrenor {
    public void sportAntrenor(String sport) {
        System.out.println("Aceta este un antrenor de: " + sport);
    }

    public void  nrEchipe(int num) {
        System.out.println("Antrenorul trebuie sa duca: " + num);
    }

    @Override
    public void tipa() {
        System.out.println("Antrenorul tipa.");
    }

    @Override
    public void suteaza() {
        System.out.println("Antrenorul suteaza.");
    }

    @Override
    public void alearga() {
        System.out.println("Antrenorul alearga.");
    }

    @Override
    public void antreneaza() {
        System.out.println("Antrenorul antreneaza.");
    }
}
