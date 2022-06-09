package activities;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Activity11_4{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/tab-opener");
        String title=driver.getTitle();
        System.out.println("Title is: " +title);

        String parentHandle = driver.getWindowHandle();
        System.out.println("Handle of Tab is: " +parentHandle);

        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));


        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for(String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }

        System.out.println("New tab title is: " +driver.getWindowHandle());
        WebElement newTabHeading = driver.findElement(By.cssSelector("div.content"));
        System.out.println("New tab heading is: " + newTabHeading.getText());

        driver.close();

    }
}
