package com.etaTech;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount bankAccount = new BankAccount("Fady","Fouad",10_000_000);
        double balance = bankAccount.deposit(2_000_000,true);
        assertEquals(12_000_000,balance,0);

    }

    @org.junit.Test
    public void withdraw() {
        fail("Not implemented");
    }

    @org.junit.Test
    public void getBalance() {
        fail("Not implemented");
    }
    @org.junit.Test
    public void dummyTest(){
        assertEquals(21,3*7);
    }
}