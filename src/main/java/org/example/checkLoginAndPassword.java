package org.example;

import java.util.regex.Pattern;

public class checkLoginAndPassword {

    public static boolean check(String login, String password, String confirmPassword) {

        try {
            if( login.length() > 20 || !Pattern.matches("^[a-zA-Z0-9_]$",login)){
                throw new WrongLoginException(login);
            }
            if( password.length() > 20 ||!Pattern.matches("^[a-zA-Z0-9_]$",password)) {

                throw new WrongPasswordException(password);

            }if (password.length() != confirmPassword.length()) {
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











































