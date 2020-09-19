package com.example;

import java.util.*;

public class SetDemo {

    public void testSetDemo() {

        List<String> alist=new ArrayList<String>();
        Set<String> aset=new LinkedHashSet<String>();

        alist.add("Parag");
        alist.add("Nitin");
        alist.add("Akshay");
        alist.add("Akshay");

        aset.add("Parag");
        aset.add("Nitin");
        aset.add("Akshay");
        aset.add("Akshay");

        //displaying elements
        System.out.println(alist);
        System.out.println(aset);
    }


    public static void main(String[] args) {
        SetDemo setDemo = new SetDemo();
        setDemo.testSetDemo();
    }
}
