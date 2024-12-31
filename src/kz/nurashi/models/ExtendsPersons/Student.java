package kz.nurashi.models.ExtendsPersons;

import kz.nurashi.models.Person;

public class Student extends Person{
    private double gpa;

    public Student(){}
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }


    public static final double SALARY = 36600.00;
    @Override
    public double getPaymentAmount() {
        return (getGpa() > 2.67) ? SALARY : 0.00;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + " earns " + getPaymentAmount();
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}

