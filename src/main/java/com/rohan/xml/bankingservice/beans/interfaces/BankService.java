package com.rohan.xml.bankingservice.beans.interfaces;

import com.rohan.xml.bankingservice.beans.Transaction;

public interface BankService {
    void deposit(Transaction transaction);

    void withdraw(Transaction transaction);

    void checkBalance();
}
