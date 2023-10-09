package javaExercises.interfaces.animale;

public class Crocodil implements Animal {
    @Override
    public void sunet() {
        System.out.println("Crocodilul e silentios.");
    }

    @Override
    public void tipDeMancare() {
        System.out.println("Crocodilul mananca alte animale.");
    }

    @Override
    public void culoare() {
        System.out.println("Crocodilul are culoarea verde.");
    }
}
