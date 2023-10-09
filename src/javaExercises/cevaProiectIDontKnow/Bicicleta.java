package javaExercises.cevaProiectIDontKnow;

public class Bicicleta extends Vehicle{
    public int nrViteze;
    public Bicicleta(String make, String model, double rentalRatePerDay, int nrViteze) {
        super(make, model, rentalRatePerDay);
        this.nrViteze = nrViteze;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("nr viteze: " + nrViteze);
    }

}
