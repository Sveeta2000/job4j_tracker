package ru.job4j.queue;

import java.util.Comparator;

/**
 * @author sveet
 * @date 02.05.2023
 */
public class TaskByUrgencyDesc implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        return Integer.compare(o2.urgency(), o1.urgency());
    }
}
