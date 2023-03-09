package ru.job4j.polymorph;

/**
 * @author sveet
 * @date 09.03.2023
 */
public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("I move on railways");
    }
}
