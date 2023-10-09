package javaExercises.inheritance;

public class Mercedes extends Autovehicul {
    public void tipMotor(){
        System.out.println("Motorul este electric.");
    }

    @Override
    public void pornireMotor() {
        System.out.println("Motorul porneste la buton.");
    }
}
