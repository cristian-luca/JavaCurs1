package javaExercises.staticExample;

public class Ecu {
    Masina car;
    public Ecu() {
        car = new Masina();
    }
    public void masinaMiscareVarStatic() {
        Masina.rezervorMotorina -= 20;
    }
    public void masinaMiscareVarNonStatic() {
        car.rezervorBenzina -= 20;
        System.out.println(" Decrementare rezervor benzina variabila Non statica " + car.rezervorBenzina);
    }
    public int valRezervorBenzina() {
        return car.rezervorBenzina;
    }
}
