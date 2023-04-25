package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

/**
 * @author sveet
 * @date 24.04.2023
 */
public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder result = new StringBuilder();
        int size = evenElements.size() / 2;
        for (int i = 0; i < size; i++) {
            result.append(evenElements.pollFirst());
            evenElements.pollFirst();
        }
        return result.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        for (int i = descendingElements.size(); i > 0; i--) {
            result.append(descendingElements.pollLast());
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
