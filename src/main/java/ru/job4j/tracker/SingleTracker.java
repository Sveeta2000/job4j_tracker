package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;

/**
 * @author sveet
 * @date 22.03.2023
 */
public final class SingleTracker {

    private Tracker tracker = new Tracker();

    private static SingleTracker singleTracker = null;

    private SingleTracker() {
    }

    public SingleTracker getSingleTracker() {
        if (singleTracker == null) {
            singleTracker = new SingleTracker();
        }
        return singleTracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public List<Item> findAll() {
        return tracker.findAll();
    }

    public List<Item> findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
