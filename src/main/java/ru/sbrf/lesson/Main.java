package ru.sbrf.lesson;

import ru.sbrf.lesson.devices.ATM;
import ru.sbrf.lesson.processing.Host;

public class Main {

    public static void main(String[] args) {

        Host host = new Host();
        //Host host = new Host(21,2,123);
        ATM atm = new ATM(host);
        if(atm.isError(1,2,123)){
            System.out.println("Ошибка при запросе баланса");
        }else {
            System.out.println("Результат запроса баланса " + atm.getBalance());
        }
    }
}
