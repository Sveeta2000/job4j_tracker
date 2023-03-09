package ru.job4j.poly;

/**
 * @author sveet
 * @date 09.03.2023
 */
public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Driving");
    }

    @Override
    public void passengers(int number) {
        System.out.println("There are " + number + "passengers on the bus.");
    }

    @Override
    public double fill(double fuel) {
        return fuel * 60;
    }
}
