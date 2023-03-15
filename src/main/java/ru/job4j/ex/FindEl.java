package ru.job4j.ex;

/**
 * @author sveet
 * @date 15.03.2023
 */
public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Could not find the target element");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"one", "two", "three"};
        try {
            int index = FindEl.indexOf(value, "tree");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
