package ru.job4j.oop;

/**
 * @author sveet
 * @date 21.02.2023
 */
public class Story {

    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
