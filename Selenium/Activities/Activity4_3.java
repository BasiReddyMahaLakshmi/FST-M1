package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        String title=driver.getTitle();
        System.out.println("Title is " +title);
        driver.findElement(By.xpath("//h3[@id='third-header']"));
        driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
        String violetButton=driver.findElement(By.xpath("//button[@class='ui violet button']")).getAttribute("class");
        System.out.println("violet button class attributes are: " +violetButton);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/button[2]"));
        driver.close();

    }
}
