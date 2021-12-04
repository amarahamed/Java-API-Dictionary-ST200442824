package com.example.dictionary.utilities;

import com.example.dictionary.models.Word;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIUtility {
    /**
     * this method will call the dictionary api passed with an english word as a parameter
     */
    public static Word[] getMeaningFromAPI(String word) throws IOException, InterruptedException {
        // remove the trailing and leading spaces of the word for browser support
        word = word.trim();
        String uri = String.format("https://api.dictionaryapi.dev/api/v2/entries/en/%s", word);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        String jsonString = response.body();
        Gson gson = new Gson();
        Word[] englishWords = null;

        try {
            if(response.statusCode() == 404) {
                System.out.println("No words found!");
            } else {
                englishWords = gson.fromJson(jsonString, Word[].class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return englishWords;
    }
}
