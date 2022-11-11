package com.capgemini;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaginaPrincipalPactometro {

    private WebDriver driver;

    private Map<String, Object> vars;

    JavascriptExecutor js;
    WebElement botonPNV;
    WebElement numabst;
    WebElement partidos;
    WebElement reset;
    WebElement img3;
    List<WebElement> atributoPNV;
    WebElement botonAbs;
    WebElement noes;



    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();

        navegaPagina();
        getElements();

    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    public void navegaPagina(){

        driver.get("https://cursosdedesarrollo.com/pactometro/");
        driver.manage().window().setSize(new Dimension(802, 824));
    }

    public void getElements(){

        botonPNV  = driver.findElement(By.id("part-PNV"));
        numabst = driver.findElement(By.id("num-abst"));
        reset =  driver.findElement(By.id("reset"));
        partidos = driver.findElement(By.id("partidos"));
        atributoPNV = driver.findElements(By.id("#part-PNV"));
        botonAbs = driver.findElement(By.id("abst"));
        noes = driver.findElement(By.id("noes"));

    }


}
