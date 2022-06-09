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

public class    Activity7 {

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
        WebElement jobs=driver.findElement(By.linkText("Post a Job"));
        jobs.click();
        String jobsPage=driver.getTitle();
        System.out.println("title is" +jobsPage);
    }

    @Test
    public void jobPage() throws InterruptedException {
        //search for Keywords
        driver.findElement(By.id("create_account_email")).sendKeys("ram1997@ibm.com");
        WebElement positionDetails=driver.findElement(By.id("job_title"));
        positionDetails.sendKeys("Test Job 1");
        String jobPostDetails=positionDetails.getText();
        driver.findElement(By.id("job_location")).sendKeys("Bangalore");
        Select dropdown = new Select(driver.findElement(By.id("job_type")));
        dropdown.selectByValue("6");
        WebElement description=driver.findElement(By.xpath("//*[@id='job_description_ifr']"));
        description.sendKeys("Job description");
        driver.findElement(By.id("application")).sendKeys("https://google.com");
        driver.findElement(By.name("company_name")).sendKeys("IBM");
        driver.findElement(By.name("submit_job")).click();
        driver.findElement(By.name("continue")).submit();
        driver.findElement(By.linkText("Jobs")).click();
        Thread.sleep(5000);
        WebElement keyword = driver.findElement(By.id("search_keywords"));
        keyword.sendKeys("Test Job 1");
        driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
        WebElement expectedJobPostDetails = driver.findElement(By.xpath("//h3[1]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String expectedJobPost = expectedJobPostDetails.getText();
        Assert.assertEquals(expectedJobPost, jobPostDetails);

    }




    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
