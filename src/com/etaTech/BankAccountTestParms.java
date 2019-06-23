package com.etaTech;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParms {

    private BankAccount bankAccount ;
    private double amount;
    private double expected;
    private boolean branch;

    public BankAccountTestParms(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @org.junit.Before
    public void setup(){
        bankAccount = new BankAccount("Fady", "Fouad", 10_000_000,BankAccount.CHECKING);
//        System.out.println("\tBefore Every Test");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
            {1_000_000.00,true,11_000_000.00},
            {2_000_000.02,true,12_000_000.02},
            {3_000_000.00,true,13_000_000.04},
            {4_000_000.06,true,14_000_000.06},
            {5_000_000.00,true,15_000_000.08}
        });
    }

    @org.junit.Test
    public void deposit() {
        bankAccount.deposit(amount, branch);
        assertEquals(expected, bankAccount.getBalance(), 0.01);
    }




    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("After Test");
    }

}