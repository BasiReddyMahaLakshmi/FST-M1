package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test(priority = 0)
    public void homepage() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Target Practice");
    }

    @Test(priority = 1)
    public void findBlackButton() {
        WebElement button = driver.findElement(By.xpath("//button[@class='ui black button']"));
        Assert.assertEquals(button.getText(), "black");
    }

    @Test(priority = 2, enabled = false)
    public void skipTest() {
        driver.findElement(By.xpath("//button[@class='ui black button']")).click();

    }

    @Test(priority = 3)
    public void test4() {
            throw new SkipException("Skip test");

    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
