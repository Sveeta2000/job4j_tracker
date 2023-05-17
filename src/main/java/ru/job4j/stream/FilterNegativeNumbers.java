package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sveet
 * @date 17.05.2023
 */
public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, 0, -2, 3, -3, 4);
        List<Integer> positive = numbers.stream().filter(x -> x > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
