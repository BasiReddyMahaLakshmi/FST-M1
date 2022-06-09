package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity3{

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    public void loginpage() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        String loginConfirmation=driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginConfirmation,"Welcome Back, admin");

    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
