package ketanselanium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseHover {
    WebDriver driver;
    JavascriptExecutor jse;
    @Before
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();



    }
    @Test
    public void test(){
        jse.executeScript("window.ScrollBy(0,600)");
        WebElement element =driver.findElement(By.id("mousehover"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        WebElement subelement = driver.findElement(By.linkText("Top"));
        action.moveToElement(subelement).click().perform();


    }
}
