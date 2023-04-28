package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author sveet
 * @date 28.04.2023
 */
public class JobAscByPriority implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
