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

    /**
     * Метод для получения списка issues репозитория.
     *
     * @return список issues репозитория
     */
    public List<Issue> getRepositoryIssues() {
        List<Issue> issues = new ArrayList<>();

        // Пример URL для получения issues репозитория.
        String url = config.getApiUrl() + "/repos/owner/repo/issues";

        // Выполняем GET-запрос к API GitHub.
        String response = httpClient.get(url, config.getAuthToken());

        // Парсим JSON-ответ.
        JSONArray jsonArray = new JSONArray(response);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Issue issue = new Issue(
                jsonObject.getString("id"),
                jsonObject.getString("title"),
                jsonObject.getString("body"),
                new User(jsonObject.getJSONObject("user").getString("id"),
                         jsonObject.getJSONObject("user").getString("login"))
            );
            issues.add(issue);
        }

        return issues;
    }
}

/*
1. Пакет и импорт:
package com.githubclient.services;: Указывает, что этот класс находится в пакете com.githubclient.services.
Импортируются необходимые классы, включая модели данных (Repository, Issue, User) и утилитарные классы (HttpClient, Config).

2. Поля класса:
private HttpClient httpClient;: Объект для выполнения HTTP-запросов.
private Config config;: Конфигурация для доступа к API GitHub.

3. Конструктор:
public GitHubService(Config config): Конструктор для создания нового объекта GitHubService с заданной конфигурацией.

4. Метод authenticate:
public boolean authenticate(String username, String password): Метод для аутентификации пользователя. В реальном приложении здесь будет логика аутентификации через OAuth или другой метод.

*/
