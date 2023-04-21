package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author sveet
 * @date 21.04.2023
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>(Arrays.asList("Lada", "BMW", "Volvo", "Toyota"));
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
