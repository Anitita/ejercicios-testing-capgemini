package com.capgemini.appirest;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.time.Duration;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

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


    @Test
    public void testGetHttpJson() throws IOException, InterruptedException, ParseException {
        // Given
        // se configura el cliente web para que haga una peticion
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/ip"))
                .timeout(Duration.ofMinutes(2))
                .build();

        //When
        //realizar la peticion
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Then
        // comprobar que la respuesta a nuestra peticion es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(200, responseStatusCode);

        //Cabecera
        HttpHeaders httpHeaders = response.headers();
        assertEquals("application/json", httpHeaders.firstValue("content-type").get());

        //Body
        String respondeBody = response.body();
        System.out.println(respondeBody);
        assertNotNull(respondeBody, "el valor debe ser diferente de null");

        // Transformamos la string a un objeto Json
        JSONParser paser = new JSONParser();
        JSONObject jsonObject =  (JSONObject) paser.parse(respondeBody);

        // Obtenemos  el valor de un atributo del objeto Json
        String origin = jsonObject.get("origin").toString();

        // Verificamos su contenido
        assertNotNull(origin, "eñ valor debe ser diferente de null");
        System.out.println(origin);

    }

    @Test
    public void testGetHttpBinOrgWithParams() throws IOException, InterruptedException, ParseException {

        // Given
        // Configuracion del cliente
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/get?param1=adios&param2=24"))
                .timeout(Duration.ofMinutes(2))
                .build();

        // When
        // Peticion
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());

        //Then
        // La respuesta del cliente es la esperada
        int responseStatusCode = response.statusCode();
        assertEquals(200, responseStatusCode);

        // Datos del body
        String respondeBody = response.body();
        System.out.println(respondeBody);
        assertNotNull(respondeBody);

        // Transformamos el String a un objeto Json
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(respondeBody);
        JSONObject args = (JSONObject) jsonObject.get("args");
        String param1 = (String) args.get("param1");
        System.out.println("param1" + param1);
        assertEquals("adios", param1);
        String param2 = (String) args.get("param2");
        System.out.println("param2" + param2);
        assertEquals("24", param2);

    }
    @Test
    public void testGetHttpBinOrgWithParams2() throws IOException, InterruptedException, ParseException {

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/get?param1=hi&param2=86"))
                .build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
    }

    @Test
    public void testPostRequest() throws IOException, InterruptedException, URISyntaxException, ParseException {

        // Given
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                        .build();

        JSONObject obj = new JSONObject();
        obj.put("name", "Ana");
        obj.put("age", 24);
        obj.put("mascota", "perro");

        HttpRequest request = HttpRequest
                .newBuilder(new URI("https://httpbin.org/post"))
                .version(HttpClient.Version.HTTP_2)
                .POST(HttpRequest.BodyPublishers.ofString(obj.toJSONString()))
                .build();

        //When
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int responseStatusCode = response.statusCode();
        String reponseBody = response.body();
        System.out.println("httpGetRequest: " + reponseBody);

        //Then
        assertEquals(200, responseStatusCode);
        String responseBody = response.body();

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        JSONObject json = (JSONObject) jsonObject.get("json");

        assertEquals("Ana",json.get("name"));
        assertEquals(24L,json.get("age"));
        assertEquals("perro", json.get("mascota"));


    }


}
