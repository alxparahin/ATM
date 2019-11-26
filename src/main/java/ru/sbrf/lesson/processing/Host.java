package ru.sbrf.lesson.processing;

import ru.sbrf.lesson.messages.Request;
import ru.sbrf.lesson.messages.Response;
import ru.sbrf.lesson.processing.exceptions.AccountNotFoundException;
import ru.sbrf.lesson.processing.exceptions.ClientNotFoundException;
import ru.sbrf.lesson.processing.exceptions.IncorrectPINException;

import java.util.ArrayList;
import java.util.HashMap;

public class Host {
    //private Client client;
    private HashMap client = new HashMap(1);
    //private Account account;
    private ArrayList accounts = new ArrayList(1);

    public Host(){
        this(1,0,123,100);
    }

    public Host(int clientId, int accountId, int PIN, int balance){
        client.put(clientId, new Client(clientId,PIN,new Account(accountId,clientId,balance)));
        ///this.account = new Account(accountId,clientId,balance);
        accounts.add(((Client) client.get(clientId)).getAccount());
        //accounts.add(((Client) client.get(clientId)).getAccount());
    }

    public Account getAccount(int accountId) {
        return (Account) accounts.get(accountId);
    }

    public Response getBalance(Request request) {
        Client localClient = (Client) client.get(request.getClientId());
        Account localAccount = localClient.getAccount(request.getAccountId());
        if (request.getClientId() == localClient.getClientId()) {
            if (request.getPIN() == localClient.getPIN()) {
                if(request.getAccountId() == localAccount.getAccountId()) {
                    return new Response(localAccount.getBalance());
                } else throw new AccountNotFoundException("Счет не найден");
            } else throw new IncorrectPINException("ПИН неверный");
        } else throw new ClientNotFoundException("Клиент не найден");
    }
}
