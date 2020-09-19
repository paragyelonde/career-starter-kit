package com.example;

public class CalculatorDemo {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        CalculatorDemo calObj = new CalculatorDemo();
        int num3 = calObj.add(2,2);
        System.out.println(num3);
//        calObj.add(2,2);
//        calObj.add(2,2);
//        calObj.add(2,2);
    }
}
