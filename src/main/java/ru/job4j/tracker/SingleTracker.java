package ru.job4j.tracker;

import java.util.List;

/**
 * @author sveet
 * @date 22.03.2023
 */
public final class SingleTracker {

    private MemTracker memTracker = new MemTracker();

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
        return memTracker.add(item);
    }

    public Item findById(int id) {
        return memTracker.findById(id);
    }

    public List<Item> findAll() {
        return memTracker.findAll();
    }

    public List<Item> findByName(String key) {
        return memTracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return memTracker.replace(id, item);
    }

    public void delete(int id) {
        memTracker.delete(id);
    }
}
