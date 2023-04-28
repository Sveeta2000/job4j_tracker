package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author sveet
 * @date 27.04.2023
 */
public class SortByNameJob implements Comparator<Job> {
    @Override
    public int compare(Job left, Job right) {
        return left.getName().compareTo(right.getName());
    }
}
