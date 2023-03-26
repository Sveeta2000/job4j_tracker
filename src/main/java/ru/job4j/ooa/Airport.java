package ru.job4j.ooa;

/**
 * @author sveet
 * @date 26.03.2023
 */
public class Airport {

    public static void main(String[] args) {
        final Airbus airbus = new Airbus("A320");
        System.out.println(airbus);
        airbus.printModel();
        airbus.printCountEngine();

        airbus.setName("A380");
        System.out.println(airbus);
        airbus.printCountEngine();
    }
}
