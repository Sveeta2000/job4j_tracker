package ru.job4j.polymorph;

/**
 * @author sveet
 * @date 09.03.2023
 */
public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("I fly in the sky");
    }
}
