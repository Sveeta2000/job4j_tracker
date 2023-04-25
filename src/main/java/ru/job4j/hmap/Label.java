package ru.job4j.hmap;

/**
 * @author sveet
 * @date 25.04.2023
 */
public record Label(String name, double score) implements Comparable<Label> {
    @Override
    public int compareTo(Label o) {
        return Double.compare(this.score, o.score);
    }
}
