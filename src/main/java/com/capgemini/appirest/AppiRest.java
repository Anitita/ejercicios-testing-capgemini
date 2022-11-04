package com.capgemini.appirest;


import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class AppiRest{


    @Test
    public void testGetHttpRespond() throws IOException, InterruptedException {
        // Given
        // se configura el cliente web para que haga una peticion
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://httpbin.org/get"))
                .timeout(Duration.ofMinutes(2))
                .build();

        //When
        //realizar la peticion
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Then
        // comprobar que la respuesta a nuestra peticion es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(200, responseStatusCode);

    }

    @Test
    public void testGetHttpRespondSogeti(){

        //Given
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.sogeti.com/about-us/about-sogeti/"))
                .build();

    }



}
