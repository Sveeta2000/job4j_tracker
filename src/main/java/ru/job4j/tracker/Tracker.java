package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        return items.get(id);
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = id >= 0 && id < items.size();
        if (rsl) {
            items.remove(id);
            items.add(id, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = id >= 0 && id < items.size();
        if (rsl) {
            items.remove(id);
        }
        return rsl;
    }
}