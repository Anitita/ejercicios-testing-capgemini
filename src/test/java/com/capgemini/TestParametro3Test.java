package com.capgemini;// Generated by Selenium IDE


import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestParametro3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testParametro3() {
    // Test name: testParametro3
    // Step # | name | target | value
    // 1 | open | /pactometro/ | 
    driver.get("https://cursosdedesarrollo.com/pactometro/");
    // 2 | setWindowSize | 1192x744 | 
    driver.manage().window().setSize(new Dimension(1192, 744));
    // 3 | click | id=part-Podemos | 
    driver.findElement(By.id("part-Podemos")).click();
    // 4 | click | id=sies | 
    driver.findElement(By.id("sies")).click();
    // 5 | click | css=#part-PSOE > h2 | 
    driver.findElement(By.id("part-PSOE")).click();
    // 6 | click | id=sies | 
    driver.findElement(By.id("sies")).click();
    // 7 | click | css=#part-Vox > img | 
    driver.findElement(By.id("part-Vox")).click();
    // 8 | click | id=noes | 
    driver.findElement(By.id("noes")).click();
    // 9 | click | css=#part-ERC > img | 
    driver.findElement(By.id("part-ERC")).click();
    // 10 | click | id=noes | 
    driver.findElement(By.id("noes")).click();
    // 11 | verifyElementPresent | id=num-sies | 
    {
      List<WebElement> elements = driver.findElements(By.id("num-sies"));
      assert(elements.size() > 0);
    }
    // 12 | assertText | id=num-sies | 155
    assertEquals("155",driver.findElement(By.id("num-sies")).getText());
    // 13 | verifyElementPresent | id=num-noes | 
    {
      List<WebElement> elements = driver.findElements(By.id("num-noes"));
      assert(elements.size() > 0);
    }
    // 14 | assertText | id=num-noes | 65
    assertEquals("65",driver.findElement(By.id("num-noes")).getText());
    // 15 | click | css=#part-PNV > img | 
    driver.findElement(By.id("part-PNV")).click();
    // 16 | click | id=abst | 
    driver.findElement(By.id("abst")).click();
    // 17 | verifyElementPresent | id=abst | 
    {
      List<WebElement> elements = driver.findElements(By.id("abst"));
      assert(elements.size() > 0);
    }
    // 18 | assertText | id=num-abst | 6
    assertEquals("6", driver.findElement(By.id("num-abst")).getText());
    // 19 | click | id=reset | 
    driver.findElement(By.id("reset")).click();
    // 20 | assertText | id=num-sies | 0
    assertEquals("0", driver.findElement(By.id("num-sies")).getText());
    // 21 | assertText | id=num-abst | 0
    assertEquals("0", driver.findElement(By.id("num-abst")).getText());
    // 22 | assertText | id=num-noes | 0
    assertEquals("0", driver.findElement(By.id("num-noes")).getText());

  }

  @Test
  public void testBotonPulsadoBotonDeshabilitado(){
    // 1 | open | /pactometro/ |
    driver.get("https://cursosdedesarrollo.com/pactometro/");
    // 2 | setWindowSize | 1402x1219 |
    driver.manage().window().setSize(new Dimension(1402, 1219));
    WebElement botonPSOE = driver.findElement(By.id("part-PSOE"));
    botonPSOE.click();
    // System.out.println(botonPSOE.getAttribute("disabled"));
    assertEquals("true", botonPSOE.getAttribute("disabled"));
    driver.findElement(By.id("noes")).click();
    botonPSOE = driver.findElement(By.id("part-PSOE"));
    // System.out.println("style: " +botonPSOE.getAttribute("style"));
    assertEquals("display: none;", botonPSOE.getAttribute("style"));
  }
}