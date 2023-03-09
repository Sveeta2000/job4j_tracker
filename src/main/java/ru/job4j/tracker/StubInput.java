package ru.job4j.tracker;

/**
 * @author sveet
 * @date 09.03.2023
 */
public class StubInput implements Input {
    @Override
    public String askStr(String question) {
        return null;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
