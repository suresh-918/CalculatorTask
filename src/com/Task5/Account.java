package com.Task5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account opened with balance: " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
    }

    public double getBalance() {
        return balance;
    }
    
    public static void main(String []args) {
    	Account acc = new Account("ACC1001", 5000);
    	
    	acc.deposit(1500);
        acc.withdraw(2000);
        acc.withdraw(6000); 
        acc.deposit(1000);
        
        System.out.println("Final Balance: " + acc.getBalance());
        
        acc.printTransactionHistory();
    }
}

