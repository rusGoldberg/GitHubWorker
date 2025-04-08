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

    /**
     * Возвращает строковое представление объекта User.
     *
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
/*
1. Пакет и импорт:
package com.githubclient.model;: Указывает, что этот класс находится в пакете com.githubclient.model.

2. Поля класса:
private String id;: Идентификатор пользователя.
private String username;: Имя пользователя.

3. Конструктор:
public User(String id, String username): Конструктор для создания нового объекта User с заданными параметрами.

4. Геттеры и сеттеры:
Стандартные методы для получения и установки значений полей класса.

5. Метод toString:
@Override public String toString(): Возвращает строковое представление объекта User, что полезно для отладки и логирования.

Эти классы представляют модели данных, которые будут использоваться в приложении для хранения информации о репозиториях, issues и пользователях.
*/


