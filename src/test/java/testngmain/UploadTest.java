package testngmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadTest {
    public String baseUrl = "http://demo.guru99.com/test/upload/";
    WebDriver driver;

    @BeforeTest
    public void createDriver() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
            public void test() {
        driver.findElement(By.id("terms")).click();
        WebElement resultElement = driver.findElement(By.cssSelector("#res"));
        WebElement resultText = driver.findElement(By.cssSelector("#res > center"));
        Assert.assertNotEquals(resultElement, "");
        Assert.assertNotEquals(resultText, "");

    }
    @AfterTest
    public void closeSite() {
        driver.quit();
        System.out.println("WE GOT IT");
    }
}

