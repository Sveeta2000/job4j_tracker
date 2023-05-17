package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sveet
 * @date 17.05.2023
 */
public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }
}
