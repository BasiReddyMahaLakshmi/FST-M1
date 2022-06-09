package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title=driver.getTitle();
        System.out.println("Title is " +title);
        WebElement checkbox=driver.findElement(By.xpath("//input[@name='toggled']"));
        System.out.println("displayed status before removal is: " +checkbox.isDisplayed());
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        System.out.println("displayed status after removal is: " +checkbox.isDisplayed());
        driver.close();

    }
}
