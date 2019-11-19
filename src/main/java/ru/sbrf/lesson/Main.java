package ru.sbrf.lesson;

import ru.sbrf.lesson.devices.ATM;
import ru.sbrf.lesson.processing.Host;
import ru.sbrf.lesson.processing.exceptions.*;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Результат запроса баланса " + new ATM(new Host()).getBalance(11,2,123));
        } catch (BusinessException e) {
//            AccountNotFoundException | ClientNotFoundException | IncorrectPINException
            System.out.println("Ошибка при запросе баланса: " + e.getMessage());
            System.out.println(e.getClass());
            System.out.println(ClientNotFoundException.class);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }

    }
}
