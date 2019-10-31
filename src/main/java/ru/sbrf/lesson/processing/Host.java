package ru.sbrf.lesson.processing;

import ru.sbrf.lesson.messages.Request;
import ru.sbrf.lesson.messages.Response;

public class Host {
    private Client client;
    private Account account;

    public Host(){
        this(1,2,123);
    }

    public Host(int clientId, int accountId, int PIN){
        this.client = new Client(clientId,PIN);
        this.account = new Account(accountId,clientId,100);
    }

    public Account getAccount() {
        return account;
    }

    public Response getBalance(Request request){
        if (request.getClientId() == client.getClientId()) {
            if (request.getPIN() == client.getPIN()) {
                if(request.getAccountId() == this.getAccount().getAccountId()){
                    return new Response(false, String.valueOf(this.getAccount().getBalance()));
                }
            }
        }
        return new Response(true, "");
    }
}
