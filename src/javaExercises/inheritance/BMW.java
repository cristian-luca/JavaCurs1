package javaExercises.inheritance;

public class BMW extends Autovehicul {
    public void gear() {
        System.out.println("Cutia este automata.");
    }

    public void marca() {
        System.out.println("Marca este BMW.");
    }

    @Override
    public void acelerare() {
        System.out.println("Nu are putere la BMW.");
    }
}
