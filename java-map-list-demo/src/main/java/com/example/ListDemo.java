package com.example;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public void testArrayList() {
        List<String> alist=new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");

        //displaying elements
        System.out.println(alist);

        //Adding "Steve" at the fourth position
        alist.add(3, "Steve");

        //displaying elements
        System.out.println(alist);

        alist.set(0, "Lucy");
        System.out.println(alist);

        Collections.sort(alist);
        System.out.println(alist);
    }
    public static void main(String[] args) {
        ListDemo listdemo = new ListDemo();
        listdemo.testArrayList();
    }
}
