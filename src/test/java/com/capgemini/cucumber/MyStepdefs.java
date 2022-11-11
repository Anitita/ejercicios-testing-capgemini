package com.capgemini.cucumber;

import com.capgemini.Calculadora;
import io.cucumber.java.*;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {
    Calculadora c;
    Integer i;



    @Given("Tengo un objeto de la calcuradora")
    public void init() {
        this.c = new Calculadora();
    }

    @When("hago una suma de {int} y {int}")
    public void cosa(int a, int b) {
        this.i = this.c.suma(a,b);
    }

    @Then("el resultado es {int}")
    public void comprueba(int c) {
        assertEquals(c, this.i);
    }

    /*
    @Before
    public void setup(){
        System.out.println("Antes de todo");
    }


    @BeforeAll
    public static void beforeAll(){
        System.out.println("Antes de todo");
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("Antes de casa paso");
    }
    @After
    public void after()
    {
        System.out.println("Despues de todo");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Despues de todo");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("Despues de casa paso");
    }
    */

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        System.out.println("I navigate to the login page");
    }

    @When("I submit username and password")
    public void iSubmitUsernameAndPassword() {
        System.out.println("I submit username and password");
    }

    @Then("I should be logged in")
    public void iShouldBeLoggedIn() {
        System.out.println("I should be logged in");
    }
}
