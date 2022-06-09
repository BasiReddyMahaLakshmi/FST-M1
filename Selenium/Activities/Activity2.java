package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title=driver.getTitle();
        System.out.println("Title is " +title);
        WebElement id=driver.findElement(By.id("about-link"));
        System.out.println("Text is " +id.getText());

        WebElement classlocator =driver.findElement(By.className("huge"));
        System.out.println("Text of classLocator is " +classlocator.getText());

        WebElement linktextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text of linkText is " +linktextLocator.getText());

        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text of cssText is " +cssLocator.getText());

        Thread.sleep(5000);
        driver.close();
    }
}
