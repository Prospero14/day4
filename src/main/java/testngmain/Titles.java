package testngmain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Titles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Prospero/Desktop/driver2/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();


        String baseUrl = "http://demo.guru99.com/test/newtours/";
        chromeDriver.get(baseUrl);

        System.out.println("Chrome title = " + chromeDriver.getTitle());
        chromeDriver.quit();

    }
}
