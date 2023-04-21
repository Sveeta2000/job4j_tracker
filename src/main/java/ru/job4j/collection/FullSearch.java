package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * @author sveet
 * @date 21.04.2023
 */
public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
