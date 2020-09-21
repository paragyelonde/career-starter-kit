package com.example;

import java.io.File;
import java.util.HashMap;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Bank implements BankInterface {
    private String bankName = null;

    HashMap<String, BankAccountInfo> accounts = new HashMap<String, BankAccountInfo>();

    Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(String firstName, String lastName) {
        BankAccountInfo accountInfo = new BankAccountInfo(firstName, lastName, 0);
        accounts.put(firstName, accountInfo);
//        this.firstName = firstName;
//        this.lastName = lastName;
    }

    public void deposit(String firstName, int amount) {
        BankAccountInfo accountInfo = accounts.get(firstName);
        int extBalance = accountInfo.getBalance();
        accountInfo.setBalance(extBalance + amount);
        accounts.put(firstName, accountInfo);
    }

    public void withdraw(String firstName, int amount) throws Exception {

        BankAccountInfo accountInfo = accounts.get(firstName);
        int extBalance = accountInfo.getBalance();
        if (extBalance >= amount) {
            accountInfo.setBalance(extBalance - amount);
            accounts.put(firstName, accountInfo);
        } else {
            throw new Exception("Your Balance is to low for this Transaction...");
        }
    }

    public void accountDetails(String firstName) {
        BankAccountInfo accountInfo = accounts.get(firstName);
        System.out.println(accountInfo);
    }

    public void exportBankAccount() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new File("/home/parag/Documents/my/career-starter-kit/java-oops-demo/src/main/resources/accounts.json"), accounts);
    }

}
