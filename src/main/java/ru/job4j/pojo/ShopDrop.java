package ru.job4j.pojo;

/**
 * @author sveet
 * @date 28.02.2023
 */
public class ShopDrop {

    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
