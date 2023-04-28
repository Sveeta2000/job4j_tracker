package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author sveet
 * @date 28.04.2023
 */
public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
