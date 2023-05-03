package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета
 * @author sveet
 * @date 24.04.2023
 * @version 1.0
 */
public class Account {
    /**
     * Хранение реквизитов счёта осуществляется в поле типа String
     */
    private String requisite;

    /**
     * Хранение баланса счёта осуществляется в поле типа double
     */
    private double balance;

    /**
     * Конструктор для создания объекта счёта с инициализацией следующих полей
     * @param requisite реквизиты счёта
     * @param balance баланс счёта
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод позволяет получить реквизиты счёта
     * @return возвращает строковое представление реквизитов счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод позволяет установить реквизиты счёта
     * @param requisite новые реквизиты, которыми заменяется
     *                  прошлое значение поля requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод позволяет получить баланс счёта
     * @return возвращает баланс счёта
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод позволяет установить баланс счёта
     * @param balance новый баланс, которым заменяется
     *                прошлое значение поля balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод позволяет сравнить два счёта на основании их реквизитов
     * @param o объект, с которым сравнивается счёт
     * @return возвращает true если счёт и объект о равны,
     *         false если счёт и объект о не равны, или объект о равен null
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод позволяет сгенерировать хэшкод объекта по полю реквизиты
     * @return возвращает хэшкод в виде числового значения
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
