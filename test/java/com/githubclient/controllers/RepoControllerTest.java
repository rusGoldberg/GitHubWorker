package com.githubclient.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RepoControllerTest {

    private RepoController repoController;

    @BeforeEach
    void setUp() {
        repoController = new RepoController();
    }

    @Test
    void testInitialize() {
        // Вызываем метод initialize и проверяем, что список репозиториев не пустой
        repoController.initialize();
        assertFalse(repoController.getRepositories().isEmpty());
    }
}
/*1. Импорт:*/
    /*Импортируются необходимые классы из JUnit для написания тестов.*/
/*2. Поля класса:*/
    /*private RepoController repoController;: Объект контроллера, который будет тестироваться.*/
/*3. Метод setUp:*/
    /*Аннотация @BeforeEach указывает, что этот метод будет выполняться перед каждым тестом. Инициализирует объект RepoController.*/
