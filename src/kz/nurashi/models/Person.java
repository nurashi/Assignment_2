package kz.nurashi.models;

import kz.nurashi.models.Interfaces.Payable;

import static java.util.Objects.compare;

public class Person implements Payable, Comparable<Person> {
    private int id;
    private String name;
    private String surname;
    private static int IDCounter = 1;

    public Person(){}

    public Person(String name, String surname) {
        id = IDCounter++;
        setName(name);
        setSurname(surname);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    // In class Person I have one person which will be compare with another class like(Student, Employee)
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
