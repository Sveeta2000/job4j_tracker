package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author sveet
 * @date 15.03.2023
 */
class FactTest {

    @Test
    public void calcWhenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Fact fact = new Fact();
                    fact.calc(-1);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("N can't be less than 0");
    }

    @Test
    public void calcWhen3Then6() {
        int expected = 6;
        int result = new Fact().calc(3);
        assertThat(result).isEqualTo(expected);
    }
}