package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sveet
 * @date 28.04.2023
 */
class ItemAscByNameTest {

    @Test
    public void whenAscendingOrder() {
        Item one = new Item("1");
        Item two = new Item("2");
        Item three = new Item("3");
        List<Item> items = Arrays.asList(three, one, two);
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(one, two, three);
        assertThat(items).isEqualTo(expected);
    }
}