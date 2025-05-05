package com.githubclient.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoginControllerTest {

    private LoginController loginController;

    @BeforeEach
    void setUp() {
        loginController = new LoginController();
    }

    @Test
    void testHandleLoginSuccess() {
        // Устанавливаем корректные значения для имени пользователя и пароля
        loginController.getUsernameField().setText("validUser");
        loginController.getPasswordField().setText("validPassword");

        // Вызываем метод handleLogin и проверяем результат
        loginController.handleLogin(null);
        assertEquals("Login successful!", loginController.getErrorMessage().getText());
    }

    @Test
    void testHandleLoginFailure() {
        // Устанавливаем некорректные значения для имени пользователя и пароля
        loginController.getUsernameField().setText("");
        loginController.getPasswordField().setText("");

        // Вызываем метод handleLogin и проверяем результат
        loginController.handleLogin(null);
        assertEquals("Please enter both username and password.", loginController.getErrorMessage().getText());
    }
}
/*1. Импорт:*/
    /* Импортируются необходимые классы из JUnit для написания тестов.*/
/*2. Поля класса:*/
    /* private LoginController loginController;: Объект контроллера, который будет тестироваться.*/
/*3. Метод setUp:*/
    /* Аннотация @BeforeEach указывает, что этот метод будет выполняться перед каждым тестом. Инициализирует объект LoginController.*/
/*4. Метод testHandleLoginSuccess:*/
    /* Проверяет успешную аутентификацию. Устанавливает корректные значения для имени пользователя и пароля и вызывает метод handleLogin. Проверяет, что сообщение об успешном входе отображается.*/
