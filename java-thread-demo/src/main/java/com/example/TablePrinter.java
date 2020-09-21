package com.example;

public class TablePrinter extends Thread {
    int tableNo;

    TablePrinter(int tableNo) {
        this.tableNo = tableNo;
    }

    public void run(){
        printTable();
    }

    public void printTable() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(tableNo+" = "+tableNo*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
