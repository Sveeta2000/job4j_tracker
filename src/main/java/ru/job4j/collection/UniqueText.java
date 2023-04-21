package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author sveet
 * @date 21.04.2023
 */
public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(origin));
        for (String str : text) {
            if (!check.contains(str)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
