package ru.job4j.oop;

/**
 * @author sveet
 * @date 21.02.2023
 */
public class Ball {

    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Ball has been eaten.");
        } else {
            System.out.println("Ball has run away.");
        }
    }
}
