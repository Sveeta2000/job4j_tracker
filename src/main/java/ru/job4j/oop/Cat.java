package ru.job4j.oop;

/**
 * @author sveet
 * @date 21.02.2023
 */
public class Cat {

    public String sound() {
        String voice = "may-may";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
        Cat sparky = new Cat();
    }
}
