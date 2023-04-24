package ru.job4j.collection;

import java.util.HashMap;

/**
 * @author sveet
 * @date 24.04.2023
 */
public class UsageMap {

    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("svetaaa@mail.ru", "Sveta Kashina");
        contacts.put("parsentev@yandex.ru", "Petr Arsentev");
        for (String key : contacts.keySet()) {
            System.out.println(key + " = " + contacts.get(key));
        }
    }
}
