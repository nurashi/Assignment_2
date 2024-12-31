package kz.nurashi;

import kz.nurashi.models.ExtendsPersons.Employee;
import kz.nurashi.models.ExtendsPersons.Student;
import kz.nurashi.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyApplication {
    public static void main(String[] args) {
        Person student1 = new Student("Bake", "Bakeev", 3.0);
        Person employee2 = new Employee("Harry", "Potter", "Lecture", 35999.59);
        Person student2 = new Student("Hermione", "Granger", 2.9);
        Person student3 = new Student("Draco" , "Malfoy", 4.0);
        Person student4 = new Student("Ron", "Qeasley", 2.3);
        Person employee1 = new Employee("Balenbay", "Balenbayev", "Lecture", 27000.55);
        Person employee3 = new Employee("Minerva ", "McGonagall ", "Lecture", 500000);

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(student1);
        people.add(student2);
        people.add(student3);
        people.add(student4);
        people.add(employee1);  
        people.add(employee2);
        people.add(employee3);


        Collections.sort(people);

        for(Person pers : people) {
            System.out.println(pers);
        }
    }
}
