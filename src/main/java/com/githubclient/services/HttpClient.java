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

    public String get(String urlString, String authToken) {
        StringBuilder response = new StringBuilder();
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Authorization", "token " + authToken);

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response.toString();
    }
}
/*
1. Пакет и импорт:
package com.githubclient.utils;: Указывает, что этот класс находится в пакете com.githubclient.utils.
Импортируются необходимые классы для выполнения HTTP-запросов.

*/
