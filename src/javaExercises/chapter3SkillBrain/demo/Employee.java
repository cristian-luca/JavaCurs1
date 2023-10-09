package javaExercises.chapter3SkillBrain.demo;

public abstract class Employee {
    //atributele vor fi accesibile numai in clasele care mostenesc clasa Employee
    // => am realizat o incapsulare a datelor din acesta clasa
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String employmentDate;
    protected int reference;   //pentru salariul angajatului

    abstract double calculateSalary();

    abstract String getName();

    public Employee(String firstName, String lastName, int age, String employmentDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employmentDate = employmentDate;
    }

    //folosim geteri si seteri pentru a accesa atributele cu modificatorul de acces protected
    //si realizam conceptul de Incapsulare

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public int getReference() {
        return reference;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }
}
