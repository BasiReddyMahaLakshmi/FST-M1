package activities;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity11_2{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String title=driver.getTitle();
        System.out.println("Title is: " +title);
        driver.findElement(By.xpath("//button[@id='confirm']")).click();
        Alert confirmation=driver.switchTo().alert();
        System.out.println(confirmation.getText());
        confirmation.dismiss();
        driver.close();

    }
}
