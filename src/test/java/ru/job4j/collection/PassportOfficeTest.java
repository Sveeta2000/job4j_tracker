package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sveet
 * @date 24.04.2023
 */
class PassportOfficeTest {
    @Test
    public void whenTestAddMethodThenTrue() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenAddSamePassportThenFalse() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44a", "Petr");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.add(citizen2)).isFalse();
    }
}