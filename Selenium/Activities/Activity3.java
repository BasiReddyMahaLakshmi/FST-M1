package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        String title=driver.getTitle();
        System.out.println("Title is " +title);
        driver.findElement(By.id("firstName")).sendKeys("Maha");
        driver.findElement(By.id("lastName")).sendKeys("Lakshmi");
        driver.findElement(By.id("email")).sendKeys("abc@xyz.com");
        driver.findElement(By.id("number")).sendKeys("7997227825");
        //driver.findElement(By.className("button")).click();
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(5000);
        alert.accept();
        driver.quit();
    }
}
