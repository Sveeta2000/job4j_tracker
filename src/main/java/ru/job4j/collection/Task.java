package ru.job4j.collection;

/**
 * @author sveet
 * @date 21.04.2023
 */
public class Task {
    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}
