package com.cybertek.tests.Library;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class libraryInvalidLogin {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //1- Go to google
        driver.get("http://library2.cybertekschool.com/login.html");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void loginAttempt() throws InterruptedException {
        //  WebElement email = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[3]/label"));
        WebElement email = driver.findElement(By.id("inputEmail"));
        // WebElement password = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/label"));
        WebElement password = driver.findElement(By.id("inputPassword"));
        WebElement signinButton = driver.findElement(By.cssSelector("#login-form > button"));
        Thread.sleep(2000);
        email.sendKeys("student63@library");
        password.sendKeys("Cybertek");
        Thread.sleep(2000);
        signinButton.click();
        Thread.sleep(2000);
        WebElement ActualInvalidLoginMessage = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/div"));
        String AIM = ActualInvalidLoginMessage.getText();
        String ExpectedInvalidLoginMessage = "Sorry, Wrong Email or Password";
        Assert.assertEquals(AIM, ExpectedInvalidLoginMessage);
        System.out.println("Expected message: " + ExpectedInvalidLoginMessage);
        System.out.println("Actual message: " + AIM);
    }
    @AfterMethod
    public void close(){
        driver.close();
    }}