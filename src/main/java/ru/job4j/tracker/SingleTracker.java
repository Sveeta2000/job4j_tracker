package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @author sveet
 * @date 22.03.2023
 */
public final class SingleTracker {

    private Tracker tracker = new Tracker();

    private static SingleTracker singleTracker = null;

    private SingleTracker(Tracker tracker) {
        this.tracker = tracker;
    }

    public SingleTracker getSingleTracker() {
        if (singleTracker == null) {
            singleTracker = new SingleTracker(tracker);
        }
        return singleTracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
