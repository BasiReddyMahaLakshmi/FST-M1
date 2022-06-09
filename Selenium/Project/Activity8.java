package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class Activity8 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();;
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }

    @Test
    public void loginPage() throws InterruptedException {
        //search for Keywords
        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys(" pa$$w0rd");
        driver.findElement(By.id("wp-submit")).submit();
        String loggedIn=driver.getTitle();
        Assert.assertEquals(loggedIn,"Log In ‹ Alchemy Jobs — WordPress");
        Thread.sleep(5000);

    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
