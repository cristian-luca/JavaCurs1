package javaExercises.abstractclass;

public class Elefant implements Comportament{
    @Override
    public void bea() {
        System.out.println("Ce betiv esti.");
    }

    @Override
    public void supravietuiesteInJungla() {
        System.out.println("Esti un adevarat survivor.");
    }

    @Override
    public String esteVanat(String tipAnimalVanat) {
        System.out.println("Ce mai elefant!");
        return "Este vanat: " + tipAnimalVanat;
    }
}
