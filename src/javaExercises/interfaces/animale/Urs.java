package javaExercises.interfaces.animale;

public class Urs implements Animal {
    @Override
    public void sunet() {
        System.out.println("Ursul face moor.");
    }

    @Override
    public void tipDeMancare() {
        System.out.println("Ursul mananca mure.");

    }

    @Override
    public void culoare() {
        System.out.println("Ursul are culoare maronie.");

    }
}
