package com.githubclient.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Утилитарный класс для выполнения HTTP-запросов.
 */
public class HttpClient {
    /**
     * Выполняет GET-запрос к указанному URL.
     *
     * @param urlString URL для выполнения запроса
     * @param authToken токен аутентификации
     * @return ответ от сервера в виде строки
     */

