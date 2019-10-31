package ru.sbrf.lesson.messages;

public class Response {
    private boolean isError;
    private String balance;

    public boolean isError() {
        return isError;
    }

    public Response(boolean isError, String balance){
        this.isError = isError;
        this.balance = balance;
    }

    public int getBalance(){
        return Integer.parseInt(balance);
    }

}
