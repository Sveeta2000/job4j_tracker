package ru.job4j.oop;

/**
 * @author sveet
 * @date 21.02.2023
 */
public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int minusRsl = minus(20);
        System.out.println(minusRsl);
        int divideRsl = calculator.divide(20);
        System.out.println(divideRsl);
        int allRsl = calculator.sumAllOperation(20);
        System.out.println(allRsl);
    }
}
