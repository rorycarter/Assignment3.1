package com.chapter3;

import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-03-26.
 */
public class PersonTest extends TestCase {

    Person person;
    @Before
    public void setUp() throws Exception {

        System.out.println("In Before Class");
    }

    @Test
    public void setFirstName() throws Exception {
        person = new Person();

        person.setFirstName("Rory");
        assertEquals("Rory", person.getFirstName());


    }

    @Test
    public void setSurname() throws Exception {
        person = new Person();

        person.setSurname("Carter");
        assertEquals("Carter", person.getSurname());


    }

    @Test
    public void setAge() throws Exception {

        person = new Person();

        person.setAge(11);
        assertEquals(11, person.getAge());


    }

    @Test
    public void getFirstName() throws Exception {
        person = new Person();

        person.setFirstName("Rory");
        assertEquals("Rory", person.getFirstName());



    }

    @Test
    public void getSurname() throws Exception {


        person = new Person();

        person.setSurname("Carter");
        assertEquals("Carter", person.getSurname());

    }

    @Test
    public void getAge() throws Exception {

        person = new Person();

        person.setAge(11);
        assertEquals(11, person.getAge());

    }

    @Test
   public void testToString() throws Exception {

        person = new Person("Rory","Carter", 11);

        assertEquals("First Name: Rory Surname: Carter Age: 11", person.toString());

    }

}