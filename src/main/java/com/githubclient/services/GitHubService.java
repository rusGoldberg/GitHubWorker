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

    /**
     * Метод для получения списка репозиториев пользователя.
     *
     * @return список репозиториев пользователя
     */
    public List<Repository> getUserRepositories() {
        List<Repository> repositories = new ArrayList<>();

        // Пример URL для получения репозиториев пользователя.
        String url = config.getApiUrl() + "/user/repos";

        // Выполняем GET-запрос к API GitHub.
        String response = httpClient.get(url, config.getAuthToken());

        // Парсим JSON-ответ.
        JSONArray jsonArray = new JSONArray(response);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Repository repo = new Repository(
                jsonObject.getString("id"),
                jsonObject.getString("name"),
                jsonObject.getString("description"),
                new User(jsonObject.getJSONObject("owner").getString("id"),
                          jsonObject.getJSONObject("owner").getString("login"))
            );
            repositories.add(repo);
        }

        return repositories;
    }


