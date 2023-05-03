package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя
 * @author sveet
 * @date 24.04.2023
 * @version 1.0
 */
public class User {

    /**
     * Хранение паспортных данных осуществляется в поле типа String
     */
    private String passport;

    /**
     * Хранение имени пользователя осуществляется в поле типа String
     */
    private String username;

    /**
     * Конструктор для создания объекта пользователя с инициализацией следующих полей
     * @param passport паспорт пользователя
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод позволяет получить паспортные данные пользователя
     * @return возвращает паспортные данные пользователя в виде строки
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод позволяет установить паспортные данные пользователя
     * @param passport новые паспортные данные пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод позволяет получить имя пользователя
     * @return возвращает имя пользователя в виде строки
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод позволяет установить имя пользователя
     * @param username новое имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод позволяет сравнить двух пользователей на основании их паспортов
     * @param o объект, с которым сравнивается пользователь
     * @return возвращает true если пользователь и объект о равны,
     *         false если пользователь и объект о не равны, или объект о равен null
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод позволяет сгенерировать хэшкод объекта по полю паспорт
     * @return возвращает хэшкод в виде числового значения
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
