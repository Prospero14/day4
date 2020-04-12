package testngmain;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Alert {
     public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:/Users/Prospero/Desktop/driver2/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

         WebDriverWait wait = new WebDriverWait(driver, 20);
         driver.get("http://demo.guru99.com/test/delete_customer.php");

         driver.findElement(By.name("cusid")).sendKeys("53920");
         driver.findElement(By.name("submit")).click();
          wait.until(ExpectedConditions.alertIsPresent());
         // Switching to Alert
         org.openqa.selenium.Alert alert = driver.switchTo().alert();

         // Capturing alert message.
         String alertMessage= alert.getText();

         // Displaying alert message
         System.out.println(alertMessage);
         // Accepting alert
         alert.accept();

         wait.until(ExpectedConditions.alertIsPresent());

         // Switching to Alert
         org.openqa.selenium.Alert alert2 = driver.switchTo().alert();

         // Capturing alert message.
         String alertMessage2 = driver.switchTo().alert().getText();
         System.out.println(alertMessage2);

         driver.quit();

     }



}

