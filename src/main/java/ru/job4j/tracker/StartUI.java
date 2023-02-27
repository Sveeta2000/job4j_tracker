package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

/**
 * @author sveet
 * @date 27.02.2023
 */
public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(item.getDateTime().format(formatter));
    }
}
