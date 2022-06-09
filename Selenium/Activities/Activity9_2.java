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

public class Activity9_2{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/selects");
        WebElement chooseoption= driver.findElement(By.id("multi-value"));
        WebElement skills=driver.findElement(By.id("multi-select"));
        Select multiselect=new Select(skills);
        if(multiselect.isMultiple()) {
            multiselect.selectByVisibleText("Javascript");
            System.out.println(chooseoption.getText());
            multiselect.selectByValue("node");
            System.out.println(chooseoption.getText());
            for (int i = 3; i <= 5; i++) {
                multiselect.selectByIndex(i);
                System.out.println(chooseoption.getText());
            }
            multiselect.deselectByValue("node");
            multiselect.deselectByIndex(6);

            List<WebElement> selectedOptions = multiselect.getAllSelectedOptions();
            for (WebElement selectedOption : selectedOptions) {
                System.out.println("Selected option: " + selectedOption.getText());
            }

            multiselect.deselectAll();
            System.out.println(chooseoption.getText());
            driver.close();

        }

    }
}
