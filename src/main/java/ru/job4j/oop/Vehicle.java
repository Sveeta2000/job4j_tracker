package ru.job4j.oop;

/**
 * @author sveet
 * @date 22.02.2023
 */
public abstract class Vehicle {

    private String brand;
    private String model;
    private String type;
    private int passengers;
    private int maxSpeed;

    public abstract void accelerate();

    public abstract void steer();

    public void brake() {
        System.out.println("Стандартная тормозная система");
    }
}
