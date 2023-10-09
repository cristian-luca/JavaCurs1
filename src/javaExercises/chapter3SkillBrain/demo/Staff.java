package javaExercises.chapter3SkillBrain.demo;

import java.util.ArrayList;

public class Staff {
    ArrayList<Employee> employeeArrayList;   //elemente de tip generic Employee in ArrayList

    public Staff() {
        employeeArrayList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeArrayList.add(employee);
    }
    public void showSalaries() {
        for (Employee employee : employeeArrayList) {
            System.out.println(employee.getName() + " si castiga " + employee.calculateSalary() + " lei.");
        }
    }

    public double averageSalary() {
        double allSalary = 0;
        int employeeNumber = 0;

        while (employeeNumber < employeeArrayList.size()) {
            allSalary += employeeArrayList.get(employeeNumber).calculateSalary();
            employeeNumber++;
        }
        double averageSalary = allSalary / employeeArrayList.size();
        return averageSalary;
    }
}
