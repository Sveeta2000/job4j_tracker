package ru.job4j.oop;

/**
 * @author sveet
 * @date 22.02.2023
 */
public class Truck extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Электронная педаль газа");
    }

    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление");
    }
}
