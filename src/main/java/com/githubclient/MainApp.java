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
