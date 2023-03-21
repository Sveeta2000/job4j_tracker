package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author sveet
 * @date 21.03.2023
 */
class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Select the action number");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenCorrectInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Select the action number");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    public void whenMultipleCorrectInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int one = input.askInt("Select the action number");
        assertThat(one).isEqualTo(1);
        int two = input.askInt("Select the action number");
        assertThat(two).isEqualTo(2);
        int three = input.askInt("Select the action number");
        assertThat(three).isEqualTo(3);
    }

    @Test
    public void whenNegativeInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Select the action number");
        assertThat(selected).isEqualTo(-1);
    }

    @Test
    public void whenDouble() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0.5", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Select the action number");
        assertThat(selected).isEqualTo(1);
    }
}