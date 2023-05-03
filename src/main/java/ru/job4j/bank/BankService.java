package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает банковский сервис
 * @author sveet
 * @date 24.04.2023
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение данных о клиентах банка осуществляется в коллекции типа HashMap,
     * где ключом является объект User,
     * а значение является списком List, содержащим счета пользователя Account
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод позволяет добавить нового пользователя в систему,
     * если такого пользователя там еще нет
     * @param user пользователь, которого нужно добавить
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод позволяет удалить пользователя из системы
     * @param passport паспорт пользователя, которого необходимо удалить
     * @return возвращает true, если удаление прошло успешно, или
     *         false если удаление не было успешным
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод позволяет добавить новый счет к пользователю
     * @param passport паспорт пользователя
     * @param account новый счёт пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountList = users.get(user);
            if (!accountList.contains(account)) {
                accountList.add(account);
            }
        }
    }

    /**
     * Метод позволяет найти пользователя по его паспорту
     * @param passport паспорт искомого пользователя
     * @return возвращает объект искомого пользователя
     *         или null, если пользователь не найден
     */
    public User findByPassport(String passport) {
        User result = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = user;
                break;
            }
        }
        return result;
    }

    /**
     * Метод позволяет найти счёт пользователя по его паспорту и реквизитам счёта
     * @param passport паспорт пользователя
     * @param requisite реквизиты счёта
     * @return возвращает искомый счёт или null если счёт или пользователь не были найдены
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountsList = users.get(user);
            for (Account account : accountsList) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод позволяет перевести деньги с одного счёта на другой
     * @param srcPassport паспорт пользователя, который отправляет деньги
     * @param srcRequisite счёт пользователя, с которого отправляются деньги
     * @param destPassport паспорт пользователя, который получает деньги
     * @param destRequisite счёт пользователя, на который поступают деньги
     * @param amount отправляемая сумма
     * @return возвращает true, если перевод совершен успешно,
     *         false, если любой из счетов не был найден
     *         или на счёте отправителя было недостаточно средств
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || destAccount == null || srcAccount.getBalance() < amount) {
            return false;
        }
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return true;
    }

    /**
     * Метод позволяет получить список счетов пользователя
     * @param user пользователь, чей список счетов необходимо получить
     * @return возвращает список со всеми счетами пользователя
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
