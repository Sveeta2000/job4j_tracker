package ru.job4j.poly;

/**
 * @author sveet
 * @date 09.03.2023
 */
public interface Transport {

    void drive();

    void passengers(int number);

    double fill(double fuel);
}
