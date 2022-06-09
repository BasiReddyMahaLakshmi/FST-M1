package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity4 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void homepage() {
        WebElement secondHeading=driver.findElement(By.xpath("//h2"));
        Assert.assertEquals(secondHeading.getText(), "Quia quis non");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
