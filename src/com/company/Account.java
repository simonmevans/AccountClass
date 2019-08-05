package com.company;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    Account(int d, double b, double AIR) {
        id = d;
        balance = b;
        annualInterestRate = AIR;
        dateCreated = new Date();
    }

    public int getid() {
        return id;
    }

    public void setid(int num) {
        id = num;
    }

    public Date getDateCreated ()
    {
        return dateCreated;
    }
    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate/100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
