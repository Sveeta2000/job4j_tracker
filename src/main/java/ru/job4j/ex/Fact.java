package ru.job4j.ex;

/**
 * @author sveet
 * @date 15.03.2023
 */
public class Fact {

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N can't be less than 0");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        new Fact().calc(-1);
    }
}
