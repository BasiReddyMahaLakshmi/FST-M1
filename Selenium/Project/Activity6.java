package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Activity6 {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void homepage() {
        WebElement jobs=driver.findElement(By.id("menu-item-24"));
        jobs.click();
        String jobsPage=driver.getTitle();
        Assert.assertEquals(jobsPage, "Jobs – Alchemy Jobs");
    }

    @Test
    public void jobspage() throws InterruptedException {
        //search for Keywords
        WebElement keyword = driver.findElement(By.id("search_keywords"));
        keyword.sendKeys("Banking");
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement link=driver.findElement(By.xpath("//h3[contains(text(), 'SAP Testing')]"));
        link.click();
        driver.findElement(By.cssSelector("input[value='Apply for job']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement email=driver.findElement(By.xpath("//a[contains(@class,'job_application_email')]"));
        System.out.println("Text is: " +email.getText());

    }


    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
