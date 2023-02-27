package ru.job4j.inheritance;

/**
 * @author sveet
 * @date 27.02.2023
 */
public class TextReport {

    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
