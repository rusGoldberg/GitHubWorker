package com.githubclient.controllers;

import com.githubclient.model.Repository;
import com.githubclient.services.GitHubService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class RepoController {

    // Аннотация @FXML используется для связывания элементов интерфейса, определенных в FXML-файле, с полями контроллера.
    @FXML
    private ListView<Repository> repoListView;

    // Объект GitHubService для взаимодействия с API GitHub.
    private GitHubService gitHubService;

    // Список репозиториев, отображаемых в ListView.
    private ObservableList<Repository> repositories;
    /**
     * Конструктор контроллера.
     * Инициализирует объект GitHubService и список репозиториев.
     */
    public RepoController() {
        this.gitHubService = new GitHubService();
        this.repositories = FXCollections.observableArrayList();
    }

    /**
     * Метод для инициализации контроллера.
     * Вызывается после загрузки FXML-файла.
     */
    @FXML
    public void initialize() {
        // Устанавливаем список репозиториев в ListView.
        repoListView.setItems(repositories);

        // Загружаем репозитории пользователя.
        loadRepositories();
    }

    /**
     * Метод для загрузки репозиториев пользователя.
     */
    private void loadRepositories() {
        // Получаем список репозиториев через GitHubService.
        repositories.addAll(gitHubService.getUserRepositories());
    }
}
