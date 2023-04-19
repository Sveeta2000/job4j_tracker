package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sveet
 * @date 19.04.2023
 */
public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] arrays : list) {
            for (int num : arrays) {
                rsl.add(num);
            }
        }
        return rsl;
    }
}
