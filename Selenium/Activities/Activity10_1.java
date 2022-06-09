package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity10_1{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        Actions builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/input-events");
        String title=driver.getTitle();
        WebElement cube=driver.findElement(By.id("wrapD3Cube"));

        builder.click(cube);
        WebElement clickValue=driver.findElement(By.className("active"));
        System.out.println(clickValue.getText());

        builder.contextClick(cube);
        WebElement rightClickValue=driver.findElement(By.className("active"));
        System.out.println(rightClickValue.getText());

        builder.contextClick(cube).perform();
        WebElement doubleClickValue=driver.findElement(By.className("active"));
        System.out.println(doubleClickValue.getText());

        driver.close();

    }
}
