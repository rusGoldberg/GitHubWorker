package com.githubclient.model;

/**
 * Класс, представляющий репозиторий на GitHub.
 */
public class Repository {

    // Идентификатор репозитория.
    private String id;

    // Имя репозитория.
    private String name;

    // Описание репозитория.
    private String description;

    // Владелец репозитория.
    private User owner;

    /**
     * Конструктор для создания нового объекта Repository.
     *
     * @param id          идентификатор репозитория
     * @param name        имя репозитория
     * @param description описание репозитория
     * @param owner       владелец репозитория
     */
    public Repository(String id, String name, String description, User owner) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.owner = owner;
    }


