package com.capgemini.cucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class ApiRestStepdefs {

    private HttpClient client;
    private HttpRequest request;
    private  HttpResponse<String> response;

    @Before
    public void setup(){
        client = HttpClient.newHttpClient();
    }
    @Given("Configurar el cliente web")
    public void configurarElClienteWeb() {
        request = HttpRequest.newBuilder()
                .uri(URI.create("http://httpbin.org/get"))
                .timeout(Duration.ofMinutes(2))
                .build();
    }

    @When("Lanzar peticion que devuelva un String")
    public void realizarLaPetiicon() throws IOException, InterruptedException {
        response = client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    @Then("Comprobar que devuelve un codigo 200")
    public void comprobarQueLaRespuestaEs200() {
        int responseStatusCode = response.statusCode();
        assertEquals(200, responseStatusCode);
    }

    @Given("Cliente web")
    public void clienteWeb() {
        request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/ip"))
                .timeout(Duration.ofMinutes(2))
                .build();
    }


    @Then("Comprobar la respuesta")
    public void comprobarRespuesta() throws ParseException {
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
        assertNotNull(origin, "el valor debe ser diferente de null");
        System.out.println(origin);

    }


    @Given("Cliente")
    public void cliente() {
        client = HttpClient.newHttpClient();
        request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/get?param1=adios&param2=24"))
                .timeout(Duration.ofMinutes(2))
                .build();
    }

    @Then("Comprobamos los parametros")
    public void comprobamosLosParametros() throws ParseException {
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
}
