package com.example;

public class NonPrimDatatypesDemo {

    public static void main(String[] args) {
        String str1 = "Parag";
        String str2 = "Nitin";
        System.out.println(str1 + " and " + str2 + " are friends.");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String singleCar : cars) {
            System.out.println(singleCar);
        }

        cars = new String[3];
        for(int i=0; i<cars.length;i++) {
           cars[i] = "Car"+i;
        }
        for (String singleCar : cars) {
            System.out.println(singleCar);
        }
    }
}
