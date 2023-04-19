package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sveet
 * @date 19.04.2023
 */
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
