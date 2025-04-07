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

    // Геттеры и сеттеры для полей класса.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    /**
     * Возвращает строковое представление объекта Issue.
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "Issue{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", creator=" + creator +
                '}';
    }
}
/*
1. Пакет и импорт:
package com.githubclient.model;: Указывает, что этот класс находится в пакете com.githubclient.model.

2. Поля класса:
private String id;: Идентификатор issue.
private String title;: Заголовок issue.
private String body;: Описание issue.
private User creator;: Пользователь, создавший issue, представленный объектом User.

*/
