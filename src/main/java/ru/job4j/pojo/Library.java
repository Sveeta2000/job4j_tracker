package ru.job4j.pojo;

/**
 * @author sveet
 * @date 28.02.2023
 */
public class Library {

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 462);
        Book dune = new Book("Dune", 412);
        Book gatsby = new Book("The Great Gatsby", 137);
        Book crookedHouse = new Book("Crooked House", 211);
        Book[] lib = new Book[4];
        lib[0] = crookedHouse;
        lib[1] = cleanCode;
        lib[2] = dune;
        lib[3] = gatsby;
        for (int i = 0; i < lib.length; i++) {
            Book book = lib[i];
            System.out.println(book.getName() + " : " + book.getPages() + " pages.");
        }
        lib[0] = lib[3];
        lib[3] = crookedHouse;
        for (int i = 0; i < lib.length; i++) {
            Book book = lib[i];
            System.out.println(book.getName() + " : " + book.getPages() + " pages.");
        }
        for (int i = 0; i < lib.length; i++) {
            Book book = lib[i];
            if ("Clean Code".equals(book.getName())) {
                System.out.println(book.getName() + " : " + book.getPages() + " pages.");
            }
        }
    }
}
