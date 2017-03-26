package com.chapter3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Rory on 2017-03-26.
 */
public class runPerson {

    public static void main(String[]args) {

        ArrayList<String> person = new ArrayList<String>();
        HashSet<String> pSet = new HashSet<String>();
        HashMap<String, String> pMap = new HashMap<String, String>();
        Collection<String> collection = new HashSet<String>();

        Person p = new Person("Rory", "Carter", 20);
        Person p1 = new Person("Kelly", "November", 22);
        Person p2 = new Person("Ryan", "Golding", 23);
        Person p3 = new Person("Dane", "Pillay", 21);

        person.add(p.toString());
        person.add(p1.toString());
        person.add(p2.toString());
        person.add(p3.toString());

        Person youngPerson = new Person("Chloe", "G", 10);
        Person youngPerson1 = new Person("Kid", "Rock", 12);
        Person youngPerson2 = new Person("Barney", "Simpson", 13);
        Person youngPerson3 = new Person("Dipsy", "Do", 9);

        pSet.add(youngPerson.toString());
        pSet.add(youngPerson1.toString());
        pSet.add(youngPerson2.toString());
        pSet.add(youngPerson3.toString());

        pMap.put("1", p.toString());
        pMap.put("2", youngPerson.toString());
        pMap.put("3", p1.toString());
        pMap.put("4", youngPerson1.toString());

        String[] mapElem = new String[4];

        mapElem[0] = (String) pMap.get("1");
        mapElem[1] = (String) pMap.get("2");
        mapElem[2] = (String) pMap.get("3");
        mapElem[3] = (String) pMap.get("4");


        collection.add(p.toString());
        collection.add(youngPerson.toString());
        collection.add(p1.toString());
        collection.add(youngPerson1.toString());

        collection.toArray();

        //Displaying everything
        System.out.println("ArrayList Collection");
        for(int i = 0; i < person.size(); i++)
        {
            System.out.println(person.get(i));
        }

        System.out.println("\nHashSet Collection");
        System.out.println(pSet);

        System.out.println("\nHashMap Collection");
        System.out.println(pMap);

        System.out.println("\nGeneric Collection");
        System.out.println(collection);

    }




}
