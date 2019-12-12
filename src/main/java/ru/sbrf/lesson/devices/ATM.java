package ru.sbrf.lesson.devices;

import ru.sbrf.lesson.messages.BalanceRequestData;
import ru.sbrf.lesson.messages.Request;
import ru.sbrf.lesson.messages.Response;
import ru.sbrf.lesson.processing.Host;

public class ATM {

    private Host host;
    private int requestCounter = 0;
//    private Response response;

    public ATM(Host host){
        this.host = host;
    }

//    public boolean isError(int clientID, int accountId, int PIN){
//        response = host.getBalance(new Request(clientID, accountId, PIN));
//        return response.getBalance();
//    }

    public int getBalance(int clientID, int accountId, int PIN){
        requestCounter++;
        BalanceRequestData data = new BalanceRequestData(clientID, accountId, PIN);
//        return host.getBalance(new Request(requestCounter)).getBalance();
        return -1;
    }
}
