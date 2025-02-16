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

    /**
     * Метод, вызываемый при нажатии на кнопку входа.
     * Обрабатывает процесс аутентификации пользователя.
     *
     * @param event событие нажатия на кнопку
     */
    @FXML
    public void handleLogin(ActionEvent event) {
        // Получаем введенные пользователем имя и пароль.
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Проверяем корректность введенных данных.
        if (username.isEmpty() || password.isEmpty()) {
            errorMessage.setText("Please enter both username and password.");
            return;
        }

        // Выполняем аутентификацию через GitHubService.
        boolean isAuthenticated = gitHubService.authenticate(username, password);

        if (isAuthenticated) {
            // Если аутентификация успешна, переходим к следующему экрану (например, списку репозиториев).
            // Здесь можно добавить логику для перехода на другой экран.
            errorMessage.setText("Login successful!");
        } else {
            // Если аутентификация не удалась, отображаем сообщение об ошибке.
            errorMessage.setText("Invalid username or password.");
        }
    }
}
