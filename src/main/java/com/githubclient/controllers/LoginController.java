package com.githubclient.controllers;

import com.githubclient.services.GitHubService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {

    // Аннотация @FXML используется для связывания элементов интерфейса, определенных в FXML-файле, с полями контроллера.
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Text errorMessage;

    // Объект GitHubService для взаимодействия с API GitHub.
    private GitHubService gitHubService;

    /**
     * Конструктор контроллера.
     * Инициализирует объект GitHubService.
     */
    public LoginController() {
        this.gitHubService = new GitHubService();
    }
