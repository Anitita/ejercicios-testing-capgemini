package com.capgemini.paginacompleja;

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
    WebElement botonPNV;
    WebElement numabst;
    WebElement partidos;
    WebElement reset;
    WebElement img3;
    List<WebElement> atributoPNV;
    WebElement botonAbs;
    WebElement noes;


    PaginaPrincipalPactometro(WebDriver driver){
        this.driver = driver;
        navegaPagina();
        getElements();
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
