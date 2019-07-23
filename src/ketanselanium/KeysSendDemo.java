package ketanselanium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Command;

public class KeysSendDemo {
    WebDriver driver;
    @Before
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/p/practice#top");
        driver.manage().window().maximize();
    }
    @Test
    public void test(){
       // driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL + "a");
        //  driver.findElement(By.id("openwindow")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

    }
}
