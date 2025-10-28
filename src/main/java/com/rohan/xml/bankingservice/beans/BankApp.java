package com.rohan.xml.bankingservice.beans;

import com.rohan.xml.bankingservice.beans.interfaces.BankService;

public class BankApp {
    private BankService bankService;

    public BankService getBankService() {
        return bankService;
    }

    public void setBankService(BankService bankService) {
        this.bankService = bankService;
    }

    public void doTransaction(Transaction transaction) {
        if(transaction.getType().equals("deposit")){
            bankService.deposit(transaction);
        } else {
            bankService.withdraw(transaction);
        }
    }

    public void checkBalance() {
        bankService.checkBalance();
    }
}
