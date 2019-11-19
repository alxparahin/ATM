package ru.sbrf.lesson.processing.exceptions;

public class AccountNotFoundException extends BusinessException {

    public AccountNotFoundException(String message) {
        super(message);
    }

}
