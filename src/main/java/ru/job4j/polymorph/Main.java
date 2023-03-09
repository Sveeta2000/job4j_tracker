package ru.job4j.polymorph;

/**
 * @author sveet
 * @date 09.03.2023
 */
public class Main {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle plane = new Plane();
        Vehicle plane2 = new Plane();
        Vehicle train = new Train();
        Vehicle train2 = new Train();
        Vehicle[] vehicles = {bus, bus2, plane, plane2, train, train2};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName());
            vehicle.move();
        }
    }
}
