package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity10_2{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/selenium/input-events");
        String title=driver.getTitle();
        WebElement keyPressed=driver.findElement(By.id("keyPressed"));

        Action firstNameKey=actions.sendKeys("M").build();
        firstNameKey.perform();
        System.out.println(keyPressed.getText());

        Action keys=actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build();
        keys.perform();
        System.out.println(keyPressed.getText());
        driver.close();

    }
}
