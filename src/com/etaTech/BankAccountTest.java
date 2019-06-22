package com.etaTech;

import static junit.framework.TestCase.*;

public class BankAccountTest {

    private BankAccount bankAccount ;
    @org.junit.Before
    public void setup(){
        bankAccount = new BankAccount("Fady", "Fouad", 10_000_000,BankAccount.CHECKING);
        System.out.println("Before test");
    }

    @org.junit.Test
    public void deposit() {
        double balance = bankAccount.deposit(2_000_000, true);
        assertEquals(12_000_000, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        bankAccount.withdraw(2_000_000,true);
        assertEquals(8_000_000,bankAccount.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance() {
        bankAccount.deposit(2_000_000, true);
        assertEquals(12_000_000, bankAccount.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking(){
        BankAccount bankAccount = new BankAccount("Fady", "Fouad", 10_000_000,BankAccount.CHECKING);
        assertFalse( "Leave your message here",bankAccount.isChecking());
    }
}