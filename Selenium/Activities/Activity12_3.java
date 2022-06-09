package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity12_3{
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.training-support.net/selenium/popups");
        System.out.println("Page title is: " + driver.getTitle());

        WebElement signin=driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));
        builder.moveToElement(signin).build().perform();
        String tooltipText = signin.getAttribute("data-tooltip");
        System.out.println("text: " + tooltipText);
        signin.click();

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

        System.out.println("logged in text is: " +driver.findElement(By.id("action-confirmation")).getText());


        driver.quit();
    }
}