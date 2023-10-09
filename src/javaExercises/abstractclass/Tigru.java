package javaExercises.abstractclass;

public class Tigru extends Animal{
    @Override
    public void mananca() {
        System.out.println("Tigrul mananca zebre.");
    }

    @Override
    public void scoateSunet(String sunet) {
        System.out.println("El rage " + sunet);
    }

    @Override
    public void doarme() {
        System.out.println("El doarme 24 de ore.");
    }

    @Override
    public String vaneaza() {
        super.doarme();
        return "vaneaza caprioare";
    }
}
