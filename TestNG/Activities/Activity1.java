package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity1 {

    WebDriver driver;

        @BeforeClass
        public void setup() {
           driver = new FirefoxDriver();
           driver.get("https://www.training-support.net");
        }
        @Test
        public void homepage() {
            String title = driver.getTitle();
            Assert.assertEquals(title, "Training Support");

            driver.findElement(By.id("about-link")).click();
            String pagetitle = driver.getTitle();
            Assert.assertEquals(pagetitle, "About Training Support");
        }

        @AfterClass
        public void closeBrowser(){
        driver.quit();
    }
}
