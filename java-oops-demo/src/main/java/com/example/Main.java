package com.example;

public class Main {

    public static void main(String[] args) throws Exception {
        GoregaonBank goregaonBank = new GoregaonBank();
        goregaonBank.openAccount("Akshay", "Rahatwal");
        goregaonBank.deposit("Akshay", 10000);
        goregaonBank.accountDetails("Akshay");

        goregaonBank.openAccount("Parag", "Yelonde");
        goregaonBank.deposit("Parag",5000);
        goregaonBank.accountDetails("Parag");

        goregaonBank.withdraw("Akshay",5000);
        goregaonBank.withdraw("Parag", 1000);

        goregaonBank.accountDetails("Akshay");
        goregaonBank.accountDetails("Parag");

        goregaonBank.exportBankAccount();
    }
}
