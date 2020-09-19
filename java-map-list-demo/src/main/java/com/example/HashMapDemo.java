package com.example;

import java.util.*;

public class HashMapDemo {

    public void testHashMap() {
        /* This is how to declare HashMap */
        LinkedHashMap<String, String> hmap = new LinkedHashMap<String, String>();
        hmap.put("Parag", "Yelonde");
        hmap.put("Akshay", "Rahatwal");
        hmap.put("Nitin", "Malap");
        hmap.put("Shubham", "Parab");
        printHashMap(hmap);
        hmap.put("Akshay", "Pitale");
        printHashMap(hmap);
        hmap.remove("Nitin");
        printHashMap(hmap);
        hmap.get("Parag");
        hmap.clone();

    }

    public void printHashMap(LinkedHashMap<String, String> hashMapVal) {
        /* Display content using Iterator*/
        Set set = hashMapVal.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.testHashMap();
    }
}
