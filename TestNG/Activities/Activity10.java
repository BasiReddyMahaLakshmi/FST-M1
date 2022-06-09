package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity10{

    WebDriver driver;
    Actions builder;

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        builder=new Actions(driver);
        Reporter.log("Start test");
        driver.get("https://www.training-support.net/selenium/sliders");
        Reporter.log("Opened browser and move to title");
        Reporter.log("Title is: " +driver.getTitle());
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.switchTo().defaultContent();
        Reporter.log("Switch to alerts");
    }

    @Test(priority = 0)
    public void sliderMiddleTest() {
        WebElement slider = driver.findElement(By.id("slider"));
        slider.click();
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Mid value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "50");

    }
    @Test(priority = 1)
    public void sliderRightEnd() {
        WebElement sliderRight = driver.findElement(By.id("slider"));
        builder.clickAndHold(sliderRight).moveByOffset(75, 0).release().build().perform();
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Right value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "100");

    }
    @Test(priority = 2)
    public void sliderLeftEnd() {
        WebElement sliderLeft = driver.findElement(By.id("slider"));
        builder.clickAndHold(sliderLeft).moveByOffset(-75, 0).release().build().perform();
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("Left value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "0");
    }

        @Test(priority = 3)
        public void slider30Test() {
            WebElement slider30 = driver.findElement(By.id("slider"));
            builder.clickAndHold(slider30).moveByOffset(-30, 0).release().build().perform();
            String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
            Reporter.log("value: " + volumeLevel);
            Assert.assertEquals(volumeLevel, "30");
        }

    @Test(priority = 4)
    public void slider80Test() {
        WebElement slider80 = driver.findElement(By.id("slider"));
        builder.clickAndHold(slider80).moveByOffset(45, 0).release().build().perform();
        String volumeLevel = driver.findElement(By.cssSelector("span#value")).getText();
        Reporter.log("value: " + volumeLevel);
        Assert.assertEquals(volumeLevel, "80");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
