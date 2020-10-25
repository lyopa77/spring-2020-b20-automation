package com.cybertek.tests.Bitrix;

import com.cybertek.utilities.WebDriverFactory;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Google {

  static   WebDriver driver;
    public static void main(String[] args) {
        //WebDriver driver;
        driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        //get the page
        driver.get("https://www.google.com");
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("apples");

       // driver.sendKeys("apples");


    }
    }


