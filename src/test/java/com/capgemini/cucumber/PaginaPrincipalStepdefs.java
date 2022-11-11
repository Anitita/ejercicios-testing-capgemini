package com.capgemini.cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PaginaPrincipalStepdefs {

    private WebDriver driver;
    JavascriptExecutor js;
    WebElement botonPNV;
    WebElement numabst;
    WebElement partidos;
    WebElement reset;
    List<WebElement> atributoPNV;
    WebElement botonAbs;
    WebElement noes;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }
    @Given("Navegar en la pagina")
    public void navegarEnLaPagina() {

        driver.get("https://cursosdedesarrollo.com/pactometro/");
        driver.manage().window().setSize(new Dimension(802, 824));

    }

    @When("busco los elementos")
    public void buscoLosElementos() {
        botonPNV  = driver.findElement(By.id("part-PNV"));
        numabst = driver.findElement(By.id("num-abst"));
        reset =  driver.findElement(By.id("reset"));
        partidos = driver.findElement(By.id("partidos"));
        atributoPNV = driver.findElements(By.id("#part-PNV"));
        botonAbs = driver.findElement(By.id("abst"));
        noes = driver.findElement(By.id("noes"));
    }

    @Then("hago las comprobaciones")
    public void hagoLasComprobaciones() {

        // 3 | click | css=#part-PNV > img |
        botonPNV.click();
        // 4 | click | id=abst |
        botonAbs.click();
        // 5 | assertElementNotPresent | id=#part-PNV |
        {
            List<WebElement> elements = atributoPNV;
            assert(elements.size() == 0);
        }
        // System.out.println(botonPP.getAttribute("disabled"));
        Assertions.assertEquals("true", botonPNV.getAttribute("disabled"));


        // 7 | click | id=partidos |
        partidos.click();
        // 8 | click | id=reset |
        reset.click();
        // 9 | click | id=num-abst |
        numabst.click();
        // 10 | click | id=num-abst |
        numabst.click();
        // 11 | assertText | id=num-abst | 0
        assertEquals("0", numabst.getText());
        // 12 | click | id=noes |
        noes.click();
    }

}
