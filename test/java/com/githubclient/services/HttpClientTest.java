package com.githubclient.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HttpClientTest {

    private HttpClient httpClient;

    @BeforeEach
    void setUp() {
        httpClient = new HttpClient();
    }

    @Test
    void testGet() {
        // Проверяем, что метод get возвращает непустой ответ
        String response = httpClient.get("https://api.github.com", "token");
        assertNotNull(response);
        assertFalse(response.isEmpty());
    }
}
/*1.Импорт:*/
    /*Импортируются необходимые классы из JUnit для написания тестов.*/
/*2.Поля класса:*/
    /*private HttpClient httpClient;: Объект клиента, который будет тестироваться.*/
/*3.Метод setUp:*/
    /*Аннотация @BeforeEach указывает, что этот метод будет выполняться перед каждым тестом. Инициализирует объект HttpClient.*/
/*4.Метод testGet:*/
