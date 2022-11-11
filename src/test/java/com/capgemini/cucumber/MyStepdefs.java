package com.capgemini.cucumber;

import com.capgemini.Calcuradora;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {
    Calcuradora c;
    Float i;
    @Given("init")
    public void init() {
        this.c = new Calcuradora();
    }

    @When("cosa")
    public void cosa() {
        this.i = this.c.suma(1F,2F);
    }

    @Then("comprueba")
    public void comprueba() {
        assertEquals(3F, this.i);
    }
}
