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
    private final HttpClient httpClient;

    // Конфигурация для доступа к API GitHub.
    private final Config config;

    /**
     * Конструктор для создания нового объекта GitHubService.
     * @param config конфигурация для доступа к API GitHub
     */
    public GitHubService(Config config) {
        this.config = config;
        this.httpClient = new HttpClient();
    }

    /**
     * Метод для аутентификации пользователя.
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
     * @return список репозиториев пользователя
     */
    public List<Repository> getUserRepositories() {
        List<Repository> repositories = new ArrayList<>();
        String url = config.getApiUrl() + "/user/repos";
        String response = httpClient.get(url, config.getAuthToken());

        if (response == null || response.isEmpty()) {
            return repositories;
        }

        JSONArray jsonArray = new JSONArray(response);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Repository repo = new Repository(
                jsonObject.getString("id"),
                jsonObject.getString("name"),
                jsonObject.optString("description", ""),
                new User(
                    jsonObject.getJSONObject("owner").getString("id"),
                    jsonObject.getJSONObject("owner").getString("login")
                )
            );
            repositories.add(repo);
        }
        return repositories;
    }

    /**
     * Метод для получения списка issues репозитория.
     * @param owner владелец репозитория
     * @param repoName имя репозитория
     * @return список issues репозитория
     */
    public List<Issue> getRepositoryIssues(String owner, String repoName) {
        List<Issue> issues = new ArrayList<>();
        String url = String.format("%s/repos/%s/%s/issues", config.getApiUrl(), owner, repoName);
        String response = httpClient.get(url, config.getAuthToken());

        if (response == null || response.isEmpty()) {
            return issues;
        }

        JSONArray jsonArray = new JSONArray(response);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            Issue issue = new Issue(
                jsonObject.getString("id"),
                jsonObject.getString("title"),
                jsonObject.optString("body", ""),
                new User(
                    jsonObject.getJSONObject("user").getString("id"),
                    jsonObject.getJSONObject("user").getString("login")
                )
            );
            issues.add(issue);
        }
        return issues;
    }
}
/*1.Пакет и импорт:*/
    /*package com.githubclient.services;: Указывает, что этот класс находится в пакете com.githubclient.services.*/
