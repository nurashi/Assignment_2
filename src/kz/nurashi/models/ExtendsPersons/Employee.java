package kz.nurashi.models.ExtendsPersons;

import kz.nurashi.models.Person;

public class Employee extends Person{
    private String position;
    private double salary;


    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() + " earns " + salary;
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

}
