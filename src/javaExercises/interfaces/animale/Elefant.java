package javaExercises.interfaces.animale;

public class Elefant implements Animal, Interfata2, Interfata3 {
    @Override
    public void sunet() {
        System.out.println("Elefantul face bum.");
    }

    @Override
    public void tipDeMancare() {
        System.out.println("Elefantul mananca frunze.");
    }

    @Override
    public void culoare() {
        System.out.println("Elefantul are culoarea gri.");

    }

    @Override
    public void jungla() {
        System.out.println("Elefantul se plimba prin jungla.");
    }

    @Override
    public void seJoaca() {
        System.out.println("Elefantul e jucaus.");
    }
}
