package com.githubclient.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    private Repository repository;

    @BeforeEach
    void setUp() {
        User owner = new User("1", "testUser");
        repository = new Repository("1", "TestRepo", "A test repository", owner);
    }

    @Test
    void testGetters() {
        assertEquals("1", repository.getId());
        assertEquals("TestRepo", repository.getName());
        assertEquals("A test repository", repository.getDescription());
        assertEquals("testUser", repository.getOwner().getUsername());
    }

    @Test
    void testSetters() {
        repository.setName("NewName");
        assertEquals("NewName", repository.getName());
    }
}
/*1.Импорт:*/
    /*Импортируются необходимые классы из JUnit для написания тестов.*/
/*2.Поля класса:*/
    /*private Repository repository;: Объект модели, который будет тестироваться.*/
/*3.Метод setUp:*/
    /*Аннотация @BeforeEach указывает, что этот метод будет выполняться перед каждым тестом. Инициализирует объект Repository.*/
/*4.Метод testGetters:*/
    /*Проверяет, что методы-геттеры возвращают правильные значения.*/
/*5.Метод testSetters:*/
    /*Проверяет, что методы-сеттеры корректно устанавливают значения.*/
