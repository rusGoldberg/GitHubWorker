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
/*
1. Пакет и импорт:
package com.githubclient.utils;: Указывает, что этот класс находится в пакете com.githubclient.utils.

2. Поля класса:
private String apiUrl;: Базовый URL для API GitHub.
private String authToken;: Токен аутентификации для доступа к API GitHub.

3. Конструктор:
public Config(String apiUrl, String authToken): Конструктор для создания нового объекта Config с заданными параметрами.
*/
