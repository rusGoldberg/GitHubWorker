package com.githubclient.utils;

/**
 * Класс для хранения конфигурации приложения.
 */
public class Config {

    // Базовый URL для API GitHub.
    private String apiUrl;

    // Токен аутентификации для доступа к API GitHub.
    private String authToken;

    /**
     * Конструктор для создания нового объекта Config.
     *
     * @param apiUrl   базовый URL для API GitHub
     * @param authToken токен аутентификации
     */
    public Config(String apiUrl, String authToken) {
        this.apiUrl = apiUrl;
        this.authToken = authToken;
    }

    // Геттеры для полей класса.

    public String getApiUrl() {
        return apiUrl;
    }

    public String getAuthToken() {
        return authToken;
    }
}
