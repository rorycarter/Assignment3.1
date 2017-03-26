package com.chapter3;

/**
 * Created by Rory on 2017-03-26.
 */
public class Person {

    String fName,sName;
    int age;

    public Person(){}
    public Person(String firstName, String surname, int a)
    {
        this.fName=firstName;
        this.sName=surname;
        this.age=a;



    }

    public void setFirstName(String fName)

    {
        this.fName=fName;
    }

    public void setSurname(String sName)
    {
        this.sName=sName;


    }

    public void setAge(int age)
    {
        this.age=age;

    }

    public String getFirstName()

    {
        return fName;
    }

    public String getSurname()

    {
        return sName;
    }

    public int getAge(){

        return age;

    }

    public String toString()
    {

        return String.format("Name: "+ fName,"/n"+ "Surname: " +sName+ "/n"+ "Age: "+ age);
    }



}
