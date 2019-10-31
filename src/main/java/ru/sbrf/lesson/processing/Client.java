package ru.sbrf.lesson.processing;

public class Client {
    private int clientId;
    private int PIN;

    public Client(int clientId, int PIN) {
        this.clientId = clientId;
        this.PIN = PIN;
    }

    public int getClientId() {
        return clientId;
    }

    public int getPIN() {
        return PIN;
    }
}
