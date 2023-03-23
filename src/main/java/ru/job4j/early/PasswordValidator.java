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
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpper = true;
                continue;
            }
            if (Character.isLowerCase(password.charAt(i))) {
                hasLower = true;
                continue;
            }
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
                continue;
            }
            if (!Character.isWhitespace(password.charAt(i))) {
                hasSpecial = true;
            }
        }
        if (!hasUpper) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!hasLower) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!hasDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!hasSpecial) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (hasTabooWords(password)) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
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
