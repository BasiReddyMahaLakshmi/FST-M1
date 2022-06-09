package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity9_1{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/selects");
        WebElement chooseoption= driver.findElement(By.id("single-value"));
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-select']"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Option 2");
        System.out.println(chooseoption.getText());
        select.selectByIndex(2);
        System.out.println(chooseoption.getText());
        select.selectByValue("4");
        System.out.println(chooseoption.getText());
        List<WebElement> options=select.getOptions();
        for(WebElement value:options){
            System.out.println(value.getText());
        }
        driver.close();


    }
}
