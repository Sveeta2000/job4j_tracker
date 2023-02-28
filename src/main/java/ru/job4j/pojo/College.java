package ru.job4j.pojo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author sveet
 * @date 28.02.2023
 */
public class College {

    public static void main(String[] args) {
        Student sveta = new Student();
        sveta.setFullName("Svetlana Kashina");
        sveta.setGroup("ANG-182");
        sveta.setAdmission(LocalDateTime.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(sveta.getFullName() + " was admitted to group " + sveta.getGroup()
                           + " on " + sveta.getAdmission().format(formatter));
    }
}
