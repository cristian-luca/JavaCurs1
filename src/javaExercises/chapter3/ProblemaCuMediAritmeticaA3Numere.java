package javaExercises.chapter3;

import utils.Utils;

public class ProblemaCuMediAritmeticaA3Numere {
    public static void main(String[] args) {
        ProblemaCuMediAritmeticaA3Numere obj = new ProblemaCuMediAritmeticaA3Numere();
        System.out.print("Introdu media aritmetica trei numere: ");
        double mediaAritmeticaA3Numere = Utils.scanner().nextDouble();
        System.out.println();
        System.out.print("Introdu cu cat este mai mare primul numar decat al doilea: ");
        double cuCatEPrimulMaiMareDecatAlDoilea = Utils.scanner().nextDouble();
        System.out.println();
        System.out.print("Introdu de cate ori este mai mare al treilea numar decat al doilea: ");
        double deCateOriEsteMaiMareAlTreileaDecatAlDoilea = Utils.scanner().nextDouble();
        System.out.println();
        double temp = findAlDoileNumar(mediaAritmeticaA3Numere, cuCatEPrimulMaiMareDecatAlDoilea, deCateOriEsteMaiMareAlTreileaDecatAlDoilea);
        System.out.println("Al doilea numar este: " + temp);
        System.out.println("Primul numar este: " + (cuCatEPrimulMaiMareDecatAlDoilea + temp));
        System.out.println("Al treilea numar este: " + (deCateOriEsteMaiMareAlTreileaDecatAlDoilea * temp));
    }

    public static double findAlDoileNumar(double mediaAritmeticaA3Numere, double cuCatEPrimulMaiMareDecatAlDoilea, double deCateOriEsteMaiMareAlTreileaDecatAlDoilea) {
        return (3 * (mediaAritmeticaA3Numere) - cuCatEPrimulMaiMareDecatAlDoilea)/(2 + deCateOriEsteMaiMareAlTreileaDecatAlDoilea);
    }

}
