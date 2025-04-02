package com.githubclient;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    /**
     * Метод start вызывается при запуске JavaFX-приложения.
     * Он инициализирует пользовательский интерфейс и отображает главное окно.
     *
     * @param primaryStage главное окно приложения
     * @throws Exception если произойдет ошибка при загрузке FXML-файла
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Создаем объект FXMLLoader для загрузки FXML-файла, который описывает интерфейс.
        // getClass().getResource() возвращает URL-адрес ресурса, который находится в том же пакете, что и текущий класс.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/githubclient/views/login.fxml"));

        // Метод load() загружает FXML-файл и создает иерархию объектов JavaFX.
        // Результат загрузки сохраняется в объекте Parent, который является корневым элементом сцены.
        Parent root = loader.load();

        // Устанавливаем заголовок окна приложения.
        primaryStage.setTitle("GitHub Client");

        // Создаем новую сцену с корневым элементом, загруженным из FXML-файла.
        Scene scene = new Scene(root);

        // Устанавливаем сцену в главное окно.
        primaryStage.setScene(scene);

        // Отображаем окно приложения.
        primaryStage.show();
    }

    /**
     * Стандартный метод main, который является точкой входа для Java-приложения.
     * Вызывает метод launch для запуска JavaFX-приложения.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Метод launch запускает JavaFX-приложение.
        // Он вызывает метод start() после инициализации JavaFX.
        launch(args);
    }
}
/*
Описание:
1. Пакет и импорт:
package com.githubclient;: Указывает, что этот класс находится в пакете com.githubclient.
Импортируются необходимые классы из библиотеки JavaFX: Application, FXMLLoader, Parent, Scene, Stage.

2. Класс MainApp:
public class MainApp extends Application: Объявляет класс MainApp, который наследует от Application. Это делает его точкой входа для JavaFX-приложения.

3. Метод start:
public void start(Stage primaryStage) throws Exception: Этот метод вызывается при запуске приложения. Он принимает объект Stage, который представляет главное окно приложения.
FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/githubclient/views/login.fxml"));: Создает объект FXMLLoader для загрузки FXML-файла, который описывает интерфейс.
Parent root = loader.load();: Загружает FXML-файл и создает иерархию объектов JavaFX. Результат сохраняется в объекте Parent.
primaryStage.setTitle("GitHub Client");: Устанавливает заголовок окна приложения.
Scene scene = new Scene(root);: Создает новую сцену с корневым элементом, загруженным из FXML-файла.
primaryStage.setScene(scene);: Устанавливает сцену в главное окно.
primaryStage.show();: Отображает окно приложения.

4. Метод main:
public static void main(String[] args): Стандартный метод main, который является точкой входа для Java-приложения.
launch(args);: Запускает JavaFX-приложение. Метод launch вызывает метод start после инициализации JavaFX.

Этот класс служит начальной точкой для запуска приложения и инициализации его интерфейса. В дальнейшем добавлю логику для перехода между различными экранами и управления состоянием приложения.
*/
