package ru.job4j.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author sveet
 * @date 02.05.2023
 */
public class ScheduleTask {

    private PriorityQueue<Task> queue;

    public ScheduleTask(Comparator<Task> comparator) {
        this.queue = new PriorityQueue<>(comparator);
    }

    public void addTask(Task task) {
        queue.offer(task);
    }

    public Task readTask() {
        return queue.peek();
    }

    public Task getTask() {
        return queue.poll();
    }
}
