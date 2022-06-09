package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity5 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void homepage() {
        WebElement jobs=driver.findElement(By.id("menu-item-24"));
        jobs.click();
        String jobsPage=driver.getTitle();
        Assert.assertEquals(jobsPage, "Jobs – Alchemy Jobs");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
