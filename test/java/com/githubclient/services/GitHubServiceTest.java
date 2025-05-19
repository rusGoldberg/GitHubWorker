package com.githubclient.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GitHubServiceTest {

    private GitHubService gitHubService;

    @BeforeEach
    void setUp() {
        Config config = new Config("https://api.github.com", "token");
        gitHubService = new GitHubService(config);
    }

    @Test
    void testAuthenticate() {
        // Проверяем метод аутентификации
        assertTrue(gitHubService.authenticate("validUser", "validPassword"));
    }

    @Test
    void testGetUserRepositories() {
        // Проверяем, что список репозиториев не пустой
        assertFalse(gitHubService.getUserRepositories().isEmpty());
    }

    @Test
    void testGetRepositoryIssues() {
        // Проверяем, что список issues не пустой
        assertFalse(gitHubService.getRepositoryIssues().isEmpty());
    }
}
/*1.Импорт:*/
    /*Импортируются необходимые классы из JUnit для написания тестов.*/
/*2.Поля класса:*/
    /*private GitHubService gitHubService;: Объект сервиса, который будет тестироваться.*/
