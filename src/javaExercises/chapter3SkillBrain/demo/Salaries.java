package javaExercises.chapter3SkillBrain.demo;

import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {
        //punctul de intrare al oricarei aplicatii java

        Staff staff = new Staff();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti salariul minim pe economie din tara dvs. in lei: ");
        while (!scanner.hasNext()) { //validam inputul
            System.out.println("Valoarea pe care ati introdus-o nu este un numar intreg. Mai incearca o data!");
        }
        //cand am introdus o valoare care e de tipul int am primit mesajul Exception in thread "main" java.util.InputMismatchException
        int salariuMinim = scanner.nextInt();

        System.out.println("Introduceti salariul mediu pe economie din tara dvs. in lei: ");
        while (!scanner.hasNext()) { //validam inputul
            System.out.println("Valoarea pe care ati introdus-o nu este un numar intreg. Mai incearca o data!");
        }
        //cand am introdus o valoare care e de tipul int am primit mesajul Exception in thread "main" java.util.InputMismatchException
        int salariuMediu = scanner.nextInt();

        staff.addEmployee(new Seller("Cristian", "Luca", 47, "2008", salariuMinim));
        //polimorfism -> obiectul ia mai multe forme
        staff.addEmployee(new Technician("Monica", "Luca", 46, "2005", salariuMediu));
        staff.addEmployee(new Warehouseman("Valentin", "Luca", 21, "2007", salariuMinim));
        staff.addEmployee(new TechnicianRisk("Maria", "Luca", 20, "2006", salariuMinim));
        staff.addEmployee(new HandlingRisk("Tudor", "Luca", 34, "2000", salariuMinim));
        staff.showSalaries();
        System.out.println("Salariul mediu in companie este: " + staff.averageSalary() + " lei.");
    }
}
