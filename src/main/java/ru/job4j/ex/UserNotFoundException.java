package ru.job4j.ex;

/**
 * @author sveet
 * @date 17.03.2023
 */
public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
