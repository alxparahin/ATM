package ru.sbrf.lesson.processing;

import java.util.ArrayList;

public class Client {
    private int clientId;
    private int PIN;
    private ArrayList<Account> account = new ArrayList<>();

    public Client(int clientId, int PIN, Account account) {
        this.clientId = clientId;
        this.PIN = PIN;
        this.account.add(account);
    }

    public int getClientId() {
        return clientId;
    }

    public int getPIN() {
        return PIN;
    }

    public ArrayList getAccount() { return account; }

    public Account getAccount(int accountId) { return (Account) account.get(accountId); }
}
