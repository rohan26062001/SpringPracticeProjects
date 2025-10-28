package com.rohan.xml.bankingservice;

import com.rohan.xml.bankingservice.beans.BankApp;
import com.rohan.xml.bankingservice.beans.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bank_service.xml");

        BankApp bankApp = applicationContext.getBean("bankApp", BankApp.class);

        bankApp.doTransaction(applicationContext.getBean("txn", Transaction.class));

        bankApp.checkBalance();
    }
}
