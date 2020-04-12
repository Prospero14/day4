package testngmain;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class ToolTipTest {
    public String baseUrl = "http://demo.guru99.com/test/social-icon.html";
    WebDriver driver;

    @BeforeTest
    public void createDriver() {
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void toolTipTest() {
        String expectedTooltip = "Github";
        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));
        String actualTooltip = github.getAttribute("title");

        Assert.assertEquals(actualTooltip, expectedTooltip);
    }

    @AfterTest
    public void closeSite() {
        driver.quit();
    }
}