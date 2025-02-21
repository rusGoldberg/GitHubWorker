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

