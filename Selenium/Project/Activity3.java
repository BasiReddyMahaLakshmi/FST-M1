package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity3{

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
    }
    @Test
    public void homepage() {
        WebElement urlHeading=driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']"));
        System.out.println(urlHeading.getAttribute("src"));
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}
