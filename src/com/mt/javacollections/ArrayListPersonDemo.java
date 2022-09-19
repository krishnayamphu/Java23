package com.mt.javacollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPersonDemo {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Ram",18));
        personList.add(new Person("Hari",19));
        personList.add(new Person("Sita",20));

        for(Person p:personList){
            System.out.println("Name:"+p.getName());
            System.out.println("Age: "+p.getAge());
        }
    }
}
