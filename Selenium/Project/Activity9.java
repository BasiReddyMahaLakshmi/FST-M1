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

import java.time.Duration;
import java.util.List;

public class Activity9 {

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
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        WebElement jobListing = driver.findElement(By.xpath("//div[contains(text(),'Job Listings')]"));
        jobListing.click();
        driver.findElement(By.linkText("Add New")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement positionDetails=driver.findElement(By.xpath("//textarea[contains(@id,'post-title-0')]"));
        positionDetails.sendKeys("Test Specialist");
        String jobPostDetails=positionDetails.getText();
        WebElement publish=driver.findElement(By.xpath("//button[contains(text(),'Publish…')]"));
        publish.click();
        WebElement confirmPublish=driver.findElement(By.xpath("//button[contains(@class,'components-button editor-post-publish-button editor-post-publish-button__button is-primary')]"));
        confirmPublish.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement viewJob=driver.findElement(By.xpath("//a[contains(@class,'components-button is-secondary')]"));
        viewJob.click();
        Thread.sleep(5000);
        WebElement expectedJobPostDetails = driver.findElement(By.xpath("//h1"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String expectedJobPost = expectedJobPostDetails.getText();
        Assert.assertEquals(expectedJobPost, jobPostDetails);
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
