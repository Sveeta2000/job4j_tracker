package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author sveet
 * @date 18.04.2023
 */
public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> hasName = x -> x.getName().contains(key);
        Predicate<Person> hasSurname = x -> x.getSurname().contains(key);
        Predicate<Person> hasAddress = x -> x.getAddress().contains(key);
        Predicate<Person> hasPhone = x -> x.getPhone().contains(key);
        Predicate<Person> combine = hasName.or(hasSurname).or(hasAddress).or(hasPhone);
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
