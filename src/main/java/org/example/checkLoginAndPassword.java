package org.example;

public class checkLoginAndPassword {

    public static boolean check(String login, String password, String confirmPassword) {

        try {
            if (login.length() > 20) {
                throw new WrongLoginException(login);
            }
            if (password.length() > 20) {
                throw new WrongPasswordException(password);
            }
            if (password.length() != confirmPassword.length()) {
                throw new WrongPasswordException(confirmPassword);
            }
            return true;
        } catch (WrongLoginException exception) {
            System.out.println("Неверный формат логина");
        } catch (WrongPasswordException exception) {
            System.out.println("Неверный формат пароля");
            System.out.println("Пароли не совпадают");

        }
        return false;
    }
}









































