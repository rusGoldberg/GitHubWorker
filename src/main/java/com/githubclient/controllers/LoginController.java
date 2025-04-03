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
/*
1. Пакет и импорт:
package com.githubclient.controllers;: Указывает, что этот класс находится в пакете com.githubclient.controllers.
Импортируются необходимые классы из библиотеки JavaFX: ActionEvent, FXML, Button, PasswordField, TextField, Text.
Импортируется класс GitHubService для взаимодействия с API GitHub.

2. Поля класса:
@FXML private TextField usernameField;: Поле для ввода имени пользователя, связанное с элементом интерфейса через аннотацию @FXML.
@FXML private PasswordField passwordField;: Поле для ввода пароля, связанное с элементом интерфейса через аннотацию @FXML.
@FXML private Button loginButton;: Кнопка для входа в систему, связанная с элементом интерфейса через аннотацию @FXML.
@FXML private Text errorMessage;: Текстовое поле для отображения сообщений об ошибках, связанное с элементом интерфейса через аннотацию @FXML.

3. Конструктор:
public LoginController(): Конструктор, который инициализирует объект GitHubService для взаимодействия с API GitHub.

4. Метод handleLogin:
@FXML public void handleLogin(ActionEvent event): Метод, вызываемый при нажатии на кнопку входа. Он обрабатывает процесс аутентификации пользователя.
Получает введенные пользователем имя и пароль из соответствующих полей.
Проверяет, что оба поля не пустые. Если одно из полей пустое, отображает сообщение об ошибке.
Выполняет аутентификацию через GitHubService. Если аутентификация успешна, отображает сообщение об успешном входе. В противном случае отображает сообщение об ошибке.

Этот контроллер управляет логикой экрана аутентификации, обрабатывая ввод пользователя и взаимодействуя с сервисом для проверки учетных данных. В дальнейшем можно добавить логику для перехода на другие экраны приложения после успешной аутентификации.
*/
