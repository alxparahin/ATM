package ru.sbrf.lesson.processing;

public class Account {
    private int accountId;
    private int clientId;
    private int balance;

    public Account(int accountId, int clientId, int balance){
        this.accountId = accountId;
        this.clientId = clientId;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getBalance() {
        return balance;
    }

}
