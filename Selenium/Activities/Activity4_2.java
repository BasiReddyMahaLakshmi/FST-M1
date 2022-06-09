package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String title=driver.getTitle();
        System.out.println("Title is " +title);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Maha");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Lakshmi");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bmlaks47@in.ibm.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("7997227825");
        driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys("sample");
        driver.findElement(By.xpath("//input[@value='submit']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(5000);
        alert.accept();
        driver.close();

    }
}
