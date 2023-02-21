package ru.job4j.oop;

/**
 * @author sveet
 * @date 21.02.2023
 */
public class Student {

    public void music(String lyrics) {
        System.out.println("Tra tra tra");
    }

    public void sing() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
        petya.music(song);
        petya.music(song);
        petya.sing();
        petya.sing();
        petya.sing();
    }
}
