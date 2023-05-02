package ru.job4j.queue;

/**
 * @author sveet
 * @date 02.05.2023
 */
public record Task(Position position,
                   String description,
                   int urgency) {
}
