package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author sveet
 * @date 23.05.2023
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1Array = o1.split("/");
        String[] o2Array = o2.split("/");
        int cmp = o2Array[0].compareTo(o1Array[0]);
        return cmp != 0 ? cmp : o1.compareTo(o2);
    }
}
