package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author sveet
 * @date 18.05.2023
 */
public class MatrixToList {
    public static List<Integer> convert(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}
