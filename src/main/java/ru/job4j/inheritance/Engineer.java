package ru.job4j.inheritance;

/**
 * @author sveet
 * @date 27.02.2023
 */
public class Engineer extends Profession {

    private int experience;

    public Engineer(int experience, boolean degree) {
        super(degree);
        this.experience = experience;
    }
}
