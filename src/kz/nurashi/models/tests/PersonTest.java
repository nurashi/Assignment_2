package kz.nurashi.models.tests;

import kz.nurashi.models.ExtendsPersons.Student;
import kz.nurashi.models.Person;
import static org.junit.Assert.*;
import org.junit.Test;


// I use junit to test, so you must download this to run this test
public class PersonTest {
    @Test
    public void testCompareTo(){
        Person student1 = new Student("Harry", "Potter", 3.5);
        Person student2 = new Student("Balenbay", "Balenbaeyv", 2.2);


        int testResult = student1.compareTo(student2);
        System.out.println(testResult);

        assertTrue(testResult > 0);
    }
}
