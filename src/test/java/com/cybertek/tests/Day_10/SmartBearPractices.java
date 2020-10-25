package com.cybertek.tests.Day_10;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBearPractices {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);}

        @Test
                public void p9_deleteOrderTask(){
            WebElement markSmithCheckbox = driver.findElement(By.xpath("//td[.=Mark Smith']/../td[1]"));
            WebElement deleteButton = driver.findElement(By.id("ct100_MainContent_btnDelete"));
            deleteButton.click();
        }
    }

