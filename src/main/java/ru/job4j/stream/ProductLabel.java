package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sveet
 * @date 17.05.2023
 */
public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(product -> product.getStandard() - product.getActual() >= 0)
                .filter(product -> product.getStandard() - product.getActual() <= 3)
                .map(p -> new Label(p.getName(), p.getPrice() / 2))
                .map(Label::toString)
                .collect(Collectors.toList());
    }
}
