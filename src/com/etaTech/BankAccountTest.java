package com.etaTech;

import static junit.framework.TestCase.assertEquals;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount bankAccount = new BankAccount("Fady", "Fouad", 10_000_000);
        double balance = bankAccount.deposit(2_000_000, true);
        assertEquals(12_000_000, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        BankAccount bankAccount = new BankAccount("Fady", "Fouad", 10_000_000);
        bankAccount.withdraw(2_000_000,true);
        assertEquals(8_000_000,bankAccount.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance() {
        BankAccount bankAccount = new BankAccount("Fady", "Fouad", 10_000_000);
        bankAccount.deposit(2_000_000, true);
        assertEquals(12_000_000, bankAccount.getBalance(), 0);
    }
}