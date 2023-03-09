package ru.job4j.polymorph;

/**
 * @author sveet
 * @date 09.03.2023
 */
public class Main {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();
        Vehicle vehicle = sportCar;
        Fuel fuel = sportCar;
        vehicle.changeGear();
        fuel.refill();
    }
}
