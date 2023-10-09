package javaExercises.abstractclass;

public class Zoo {
    public static void main(String[] args) {
        Tigru tigru = new Tigru();
        tigru.mananca();
        tigru.scoateSunet("Oau");
        tigru.doarme();
        System.out.println(tigru.vaneaza());
        tigru.doarme();
        System.out.println("=======================");
        Animal pisica = new Tigru(); //se poate si asa
        pisica.doarme();
        System.out.println("=======================");
        Animal caine = (Animal) new Tigru(); //se poate si asa
        caine.scoateSunet("Auch");
        caine.doarme();
        System.out.println("=======================");
        Elefant elefant = new Elefant();
        elefant.bea();
        elefant.supravietuiesteInJungla();
        System.out.println(elefant.esteVanat("Cu fildesi"));
    }
}
