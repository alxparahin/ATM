package ru.sbrf.lesson.processing;

import ru.sbrf.lesson.messages.Request;
import ru.sbrf.lesson.messages.Response;
import ru.sbrf.lesson.processing.exceptions.AccountNotFoundException;
import ru.sbrf.lesson.processing.exceptions.ClientNotFoundException;
import ru.sbrf.lesson.processing.exceptions.IncorrectPINException;

public class Host {
    private Client client;
    private Account account;

    public Host(){
        this(1,2,123,100);
    }

    public Host(int clientId, int accountId, int PIN, int balance){
        this.client = new Client(clientId,PIN);
        this.account = new Account(accountId,clientId,balance);
    }

    public Account getAccount() {
        return account;
    }

    public Response getBalance(Request request) {
        if (request.getClientId() == client.getClientId()) {
            if (request.getPIN() == client.getPIN()) {

                if(request.getAccountId() == this.account.getAccountId()){
                    return new Response(account.getBalance());
                } else throw new AccountNotFoundException("Счет не найден");
            } else throw new IncorrectPINException("ПИН неверный");
        } else throw new ClientNotFoundException("Клиент не найден");
    }
}
