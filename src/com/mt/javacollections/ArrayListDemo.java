package com.mt.javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Orange");

        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

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
