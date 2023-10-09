package javaExercises.chapter3;

public class Persoana {
    String nume;
     int greutate = 50;

    public void prezentare(){
        System.out.println("Salut sunt "+nume+"");
    }
    public void schimbaNume(String nume) {
        this.nume = nume;
        prezentare();
    }
    public int mananca(){
        this.schimbaNume("Luca");
        return greutate++;

    }


    public static void main(String[] args) {
        Persoana persoana = new Persoana();
        persoana.prezentare();
        persoana.schimbaNume("Alexandru");
        System.out.println(persoana.mananca());
        System.out.println(persoana.nume + " are greutatea " + persoana.greutate);

        Persoana persoana2 = new Persoana();
        persoana2.prezentare();
        persoana2.schimbaNume("Adrian");
        persoana2.greutate = 90;
        System.out.println(persoana2.mananca());
        System.out.println(persoana2.nume + " are greutatea " + persoana2.greutate);

    }
}