package com.rohan.xml.bankingservice.beans;

import com.rohan.xml.bankingservice.beans.interfaces.BankService;

public class HDFCBankService implements BankService {

    private int amount;

    @Override
    public void deposit(Transaction transaction) {
        amount += transaction.getAmount();
        System.out.println("Deposited Rs. " + amount + " in HDFC Bank");
    }

    @Override
    public void withdraw(Transaction transaction) {
        amount -= transaction.getAmount();
        System.out.println("Withdrew Rs. " + amount + " from HDFC Bank");
    }

    @Override
    public void checkBalance() {
        System.out.println("Balance in HDFC Bank: Rs. " + amount);
    }
}
