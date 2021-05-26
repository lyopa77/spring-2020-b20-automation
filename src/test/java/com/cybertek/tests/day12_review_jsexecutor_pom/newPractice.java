package com.cybertek.tests.day12_review_jsexecutor_pom;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class newPractice {
     static  WebDriver driver;

    public static void main(String[] args) {
      //  WebDriver driver;
     WebDriverManager.firefoxdriver().setup();
     driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

}}
