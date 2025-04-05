package com.githubclient.controllers;

import com.githubclient.model.Issue;
import com.githubclient.services.GitHubService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class IssueController {

    // Аннотация @FXML используется для связывания элементов интерфейса, определенных в FXML-файле, с полями контроллера.
    @FXML
    private ListView<Issue> issueListView;

    // Объект GitHubService для взаимодействия с API GitHub.
    private GitHubService gitHubService;

    // Список issues, отображаемых в ListView.
    private ObservableList<Issue> issues;

    /**
     * Конструктор контроллера.
     * Инициализирует объект GitHubService и список issues.
     */
    public IssueController() {
        this.gitHubService = new GitHubService();
        this.issues = FXCollections.observableArrayList();
    }

    /**
     * Метод для инициализации контроллера.
     * Вызывается после загрузки FXML-файла.
     */
    @FXML
    public void initialize() {
        // Устанавливаем список issues в ListView.
        issueListView.setItems(issues);

        // Загружаем issues репозитория.
        loadIssues();
    }

    /**
     * Метод для загрузки issues репозитория.
     */
    private void loadIssues() {
        // Получаем список issues через GitHubService.
        issues.addAll(gitHubService.getRepositoryIssues());
    }
}

/*
1. Пакет и импорт:
package com.githubclient.controllers;: Указывает, что этот класс находится в пакете com.githubclient.controllers.
Импортируются необходимые классы из библиотеки JavaFX: FXML, ListView, FXCollections, ObservableList.
Импортируются классы Issue и GitHubService для работы с данными и API.

2. Поля класса:
@FXML private ListView<Issue> issueListView;: Список для отображения issues, связанный с элементом интерфейса через аннотацию @FXML.
private GitHubService gitHubService;: Объект для взаимодействия с API GitHub.
private ObservableList<Issue> issues;: Список issues, отображаемых в ListView.

3. Конструктор:
public IssueController(): Конструктор, который инициализирует объект GitHubService и список issues.

4. Метод initialize:
@FXML public void initialize(): Метод для инициализации контроллера, вызывается после загрузки FXML-файла.
Устанавливает список issues в ListView и загружает issues репозитория.

5.Метод loadIssues:
private void loadIssues(): Метод для загрузки issues репозитория через GitHubService.

Эти контроллеры управляют логикой экранов списка репозиториев и issues, взаимодействуя с сервисом для получения данных и отображая их в интерфейсе
*/
