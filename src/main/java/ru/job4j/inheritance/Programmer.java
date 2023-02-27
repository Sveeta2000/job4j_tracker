package ru.job4j.inheritance;

/**
 * @author sveet
 * @date 27.02.2023
 */
public class Programmer extends Engineer {

    private String programLang;

    public Programmer(String programLang, int experience, boolean degree) {
        super(experience, degree);
        this.programLang = programLang;
    }
}
