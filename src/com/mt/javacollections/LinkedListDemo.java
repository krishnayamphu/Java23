package com.mt.javacollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");

        System.out.println("======================");
        for(String item:list){
            System.out.println(item);
        }

        System.out.println("remove item Orange");
        list.remove("Orange");
        for(String item:list){
            System.out.println(item);
        }

        System.out.println("add item Banana");
        list.add("Banana");
        for(String item:list){
            System.out.println(item);
        }

    }
}
