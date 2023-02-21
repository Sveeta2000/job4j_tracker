package ru.job4j.oop;

/**
 * @author sveet
 * @date 21.02.2023
 */
public class Error {

    private boolean active;

    private int status;

    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Is active? - " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error emptyError = new Error();
        emptyError.printInfo();
        Error memoryError = new Error(true, -1, "OutOfMemoryError");
        memoryError.printInfo();
        Error stackError = new Error(false, 4, "StackOverFlowError");
        stackError.printInfo();
    }
}
