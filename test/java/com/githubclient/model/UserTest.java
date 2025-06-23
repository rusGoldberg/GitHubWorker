package com.githubclient.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User("1", "testUser");
    }

    @Test
    void testGetters() {
        assertEquals("1", user.getId());
        assertEquals("testUser", user.getUsername());
    }

    @Test
    void testSetters() {
        user.setUsername("newUser");
        assertEquals("newUser", user.getUsername());
    }
}
/*1.Импорт:*/
    /*Импортируются необходимые классы из JUnit для написания тестов.*/
/*2.Поля класса:*/
    /*private User user;: Объект модели, который будет тестироваться.*/
/*3.Метод setUp:*/
    /*Аннотация @BeforeEach указывает, что этот метод будет выполняться перед каждым тестом. Инициализирует объект User.*/
