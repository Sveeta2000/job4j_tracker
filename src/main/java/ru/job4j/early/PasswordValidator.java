package ru.job4j.early;

/**
 * @author sveet
 * @date 22.03.2023
 */
public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (!hasUpperCase(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!hasLowerCase(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!hasDigit(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!hasSpecialSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (hasTabooWords(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }

    private static boolean hasUpperCase(String str) {
        for (char symbol : str.toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasLowerCase(String str) {
        for (char symbol : str.toCharArray()) {
            if (Character.isLowerCase(symbol)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasDigit(String str) {
        for (char symbol : str.toCharArray()) {
            if (Character.isDigit(symbol)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasSpecialSymbol(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))
                && !Character.isLetter(str.charAt(i))
                && !Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasTabooWords(String str) {
        String[] taboo = {"qwerty", "12345", "password", "admin", "user"};
        for (String word : taboo) {
            if (str.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}
