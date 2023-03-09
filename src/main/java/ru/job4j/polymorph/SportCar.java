package ru.job4j.polymorph;

/**
 * @author sveet
 * @date 09.03.2023
 */
public class SportCar implements Vehicle, Fuel {
    @Override
    public void refill() {
        System.out.println("Refill");
    }

    @Override
    public void changeGear() {
        System.out.println("Change gear");
    }
}
