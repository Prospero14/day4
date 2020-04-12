package testngmain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PopUpTest {
    public String baseUrl = "http://demo.guru99.com/popup.php";
    public WebDriver driver ;

    @BeforeClass
    public void openSite() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void verifyclick() {
        String expectedAt = "@";
        WebElement actualAt =  driver.findElement(By.xpath("//*[contains(@href,'popup.php')]"));
        Assert.assertEquals(actualAt, expectedAt);
    }


    @AfterClass
    public void closeSite() {
        driver.close();
    }

}


