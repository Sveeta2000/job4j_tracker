package ru.job4j.tracker;

/**
 * @author sveet
 * @date 10.03.2023
 */
public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "Exit the program";
    }

    @Override
    public boolean execute(Input input, Store store) {
        return false;
    }
}
