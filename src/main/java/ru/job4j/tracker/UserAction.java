package ru.job4j.tracker;

/**
 * @author sveet
 * @date 10.03.2023
 */
public interface UserAction {

    String name();

    boolean execute(Input input, Store store);
}
