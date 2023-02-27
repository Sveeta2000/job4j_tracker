package ru.job4j.inheritance;

/**
 * @author sveet
 * @date 27.02.2023
 */
public class PizzaExtraCheese extends Pizza {

    @Override
    public String name() {
        return super.name() + " + extra cheese";
    }
}
