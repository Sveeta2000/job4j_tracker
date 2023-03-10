package ru.job4j.strategy;

/**
 * @author sveet
 * @date 10.03.2023
 */
public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "  _____ " + ln
                + " |     |" + ln
                + " |_____|" + ln;
    }
}
