package com.githubclient.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IssueControllerTest {

    private IssueController issueController;

    @BeforeEach
    void setUp() {
        issueController = new IssueController();
    }

    @Test
    void testInitialize() {
        // Вызываем метод initialize и проверяем, что список issues не пустой
        issueController.initialize();
        assertFalse(issueController.getIssues().isEmpty());
    }
}
/*1.Импорт:*/
    /*Импортируются необходимые классы из JUnit для написания тестов.*/
