package com.example;

public interface BankInterface {
    public void openAccount(String firstName, String lastName);
    public void deposit(String firstName, int amount);
    public void withdraw(String firstName, int amount) throws Exception;
}

