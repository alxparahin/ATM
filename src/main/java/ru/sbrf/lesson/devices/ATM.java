package ru.sbrf.lesson.devices;

import ru.sbrf.lesson.messages.Request;
import ru.sbrf.lesson.messages.Response;
import ru.sbrf.lesson.processing.Host;

public class ATM {

    private Host host;
    private Response response;

    public ATM(Host host){
        this.host = host;
    }

    public boolean isError(int clientID, int accountId, int PIN){
        response = host.getBalance(new Request(clientID, accountId, PIN));
        return response.isError();
    }

    public int getBalance(){
        return response.getBalance();
    }
}
