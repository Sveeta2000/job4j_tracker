package ru.job4j.ex;

/**
 * @author sveet
 * @date 17.03.2023
 */
public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String message) {
        super(message);
    }
}
