package com.etaTech;

/****************************************************
 *** Created by Fady Fouad on 6/21/2019 at 13:46.***
 ***************************************************/
public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVING = 2;

    private int accountType ;

    public BankAccount(String firstName, String lastName, double balance,int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM
    public double withdraw(double amount, boolean branch) {
        if (!branch&&amount>500){
          throw new IllegalArgumentException("Sorry You can't withdraw more than 500$ Because you ARE NOT A BRANCH ");
        }
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking(){
        return accountType == CHECKING;
    }

    // More methods that use firstName, lastName, and perform other functions

}
