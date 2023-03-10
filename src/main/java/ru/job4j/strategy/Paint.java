package ru.job4j.strategy;

/**
 * @author sveet
 * @date 10.03.2023
 */
public class Paint {

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint context = new Paint();
        context.draw(new Triangle());
        context.draw(new Square());
    }
}
