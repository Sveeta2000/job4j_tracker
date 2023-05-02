package ru.job4j.queue;

import java.util.Comparator;

/**
 * @author sveet
 * @date 02.05.2023
 */
public class TaskByPositionAsc implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return o1.position().compareTo(o2.position());
    }
}
