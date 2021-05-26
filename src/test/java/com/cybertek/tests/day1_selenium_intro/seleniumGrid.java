package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class seleniumGrid {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {

       //1- Setup the driver
        WebDriverManager.chromedriver().setup();

       //2- Create instance of the driver
        WebDriver driver = new ChromeDriver(); //THIS LINE IS OPENING the BROWSER

String url = "https://Lyopa:113cd4d5-eacb-4dd1-a169-5c8e73343843@ondemand.us-west-1.saucelabs.com:443/wd/hub";
        DesiredCapabilities desCab = new DesiredCapabilities();
        desCab.setBrowserName("safari");
        desCab.setPlatform(Platform.MAC);
        driver = new RemoteWebDriver(new URL(url),desCab);
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
