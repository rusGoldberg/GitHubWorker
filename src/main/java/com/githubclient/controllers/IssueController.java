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

