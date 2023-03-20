package ru.job4j.tracker;

/**
 * @author sveet
 * @date 20.03.2023
 */
public class ValidateInput extends ConsoleInput {

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter valid data");
            }
        } while (invalid);
        return value;
    }
}
