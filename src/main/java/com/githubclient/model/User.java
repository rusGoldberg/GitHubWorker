package com.githubclient.model;

/**
 * Класс, представляющий пользователя на GitHub.
 */
public class User {

    // Идентификатор пользователя.
    private String id;

    // Имя пользователя.
    private String username;

    /**
     * Конструктор для создания нового объекта User.
     *
     * @param id       идентификатор пользователя
     * @param username имя пользователя
     */
    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    // Геттеры и сеттеры для полей класса.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

