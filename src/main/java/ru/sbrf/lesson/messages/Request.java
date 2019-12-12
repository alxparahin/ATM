package ru.sbrf.lesson.messages;

import javax.validation.constraints.NotBlank;

public class Request {
//@NotBlank
//    private CharSequence cs = "NotBlank!";
    private int id;
    private String data;
    private RequestTypes type;

//    private int clientId;
//    private int accountId;
//    private int PIN;

//    public Request(int clientId, int accountId, int PIN) {
//        this.clientId = clientId;
//        this.accountId = accountId;
//        this.PIN = PIN;
//    }

    public Request(int id, String data, RequestTypes type) {
        this.id = id;
        this.data = data;
        this.type = type;
//        cs = "";
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public RequestTypes getType() {
        return type;
    }
//    public int getClientId() {
//        return clientId;
//    }
//
//    public int getAccountId() {
//        return accountId;
//    }
//
//    public int getPIN() {
//        return PIN;
//    }
}
