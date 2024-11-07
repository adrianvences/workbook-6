package com.pluralsight.finance;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount){
        this.balance -= amount;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
