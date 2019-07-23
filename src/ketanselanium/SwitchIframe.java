package ketanselanium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchIframe {
    WebDriver driver;
    @Before
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }
    @Test
    public void test(){
        driver.switchTo().frame("courses-iframe");
        driver.findElement(By.id("search-courses")).sendKeys("python");
        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).sendKeys("ketan");


    }
}
