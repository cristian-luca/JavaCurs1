package javaExercises.inheritance;

public class ConfigurareVehicul {

    public static void main(String[] args) {
        BMW bmw = new BMW();
        Mercedes mercedes = new Mercedes();
        Dacia dacia = new Dacia();

        bmw.acelerare();
        bmw.franare();
        bmw.marca();

        mercedes.acelerare();
        mercedes.franare();
        mercedes.pornireMotor();
        mercedes.tipMotor();

        dacia.franare();
        dacia.acelerare();
        dacia.pornireMotor();
        dacia.model();

    }

}
