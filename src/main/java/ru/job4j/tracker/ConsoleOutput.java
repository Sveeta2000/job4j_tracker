package ru.job4j.tracker;

/**
 * @author sveet
 * @date 14.03.2023
 */
public class ConsoleOutput implements Output {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
