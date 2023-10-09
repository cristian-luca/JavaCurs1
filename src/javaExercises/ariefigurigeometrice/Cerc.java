package javaExercises.ariefigurigeometrice;

public class Cerc implements ariaGeometrica{

    @Override
    public double calculeazaArie(double latura) {
        return Math.PI*latura*latura;
    }
}
