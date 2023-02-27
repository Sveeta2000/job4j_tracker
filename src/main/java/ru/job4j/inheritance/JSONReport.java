package ru.job4j.inheritance;

/**
 * @author sveet
 * @date 27.02.2023
 */
public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator()
                + "\t\"name\" : \"" + name + "\"," + System.lineSeparator()
                + "\t\"body\" : \"" + body + "\"" + System.lineSeparator()
                + "}";
    }
}
