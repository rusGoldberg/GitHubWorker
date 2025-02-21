package com.githubclient.model;

/**
 * Класс, представляющий issue в репозитории на GitHub.
 */
public class Issue {

    // Идентификатор issue.
    private String id;

    // Заголовок issue.
    private String title;

    // Описание issue.
    private String body;

    // Пользователь, создавший issue.
    private User creator;

    /**
     * Конструктор для создания нового объекта Issue.
     *
     * @param id      идентификатор issue
     * @param title   заголовок issue
     * @param body    описание issue
     * @param creator пользователь, создавший issue
     */
    public Issue(String id, String title, String body, User creator) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.creator = creator;
    }
