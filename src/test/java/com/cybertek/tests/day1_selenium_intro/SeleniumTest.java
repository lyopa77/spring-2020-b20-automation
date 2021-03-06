package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

       //1- Setup the driver
        WebDriverManager.chromedriver().setup();
//        System.setProperty("driver.type","path to the driver");
//        System.setProperty("webdriver.chrome.driver","path to the driver");

       //2- Create instance of the driver
        WebDriver driver = new ChromeDriver(); //THIS LINE IS OPENING ME BROWSER

        driver.manage().window().maximize();


        //3- Use the driver instance to test selenium
        driver.get("https://www.google.com");
driver.findElement(By.name("q")).sendKeys("apples"+ Keys.ENTER);
Thread.sleep(2000);

        //System.out.println("The title of the page is: " + driver.getTitle());

        String actualTitle = driver.getTitle();
        System.out.println("ACTUAL TITLE STRING: " + actualTitle);

        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        Thread.sleep(3000);


        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        driver.quit();
    }

}
