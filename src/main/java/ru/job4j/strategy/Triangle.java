package ru.job4j.strategy;

/**
 * @author sveet
 * @date 10.03.2023
 */
public class Triangle implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "   ^    " + ln
                + " /   \\ " + ln
                + "/_____\\" + ln;
    }
}
