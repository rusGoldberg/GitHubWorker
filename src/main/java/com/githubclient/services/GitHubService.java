package com.githubclient.services;

import com.githubclient.model.Issue;
import com.githubclient.model.Repository;
import com.githubclient.model.User;
import com.githubclient.utils.HttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для взаимодействия с API GitHub.
 */
public class GitHubService {
    // Объект HttpClient для выполнения HTTP-запросов.
    private HttpClient httpClient;

    // Конфигурация для доступа к API GitHub.
    private Config config;

    /**
     * Конструктор для создания нового объекта GitHubService.
     *
     * @param config конфигурация для доступа к API GitHub
     */
    public GitHubService(Config config) {
        this.config = config;
        this.httpClient = new HttpClient();
    }

    /**
     * Метод для аутентификации пользователя.
     *
     * @param username имя пользователя
     * @param password пароль пользователя
     * @return true, если аутентификация успешна, иначе false
     */
    public boolean authenticate(String username, String password) {
        // В реальном приложении здесь будет логика аутентификации через OAuth или другой метод.
        // Для примера возвращаем true.
        return true;
    }


