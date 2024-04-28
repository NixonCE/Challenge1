package com.api;

import com.api.MonedasReq;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MonedasApi {
    public MonedasReq MonedasData(String moneda) {

        String direccionApi = "https://v6.exchangerate-api.com/v6/50c33799565cdf1cf11364c0/latest/" + moneda;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccionApi)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), MonedasReq.class);
        } catch (Exception e) {
            System.out.println("Error en la peticion: " + e);
        }
        return null;
    }


}
