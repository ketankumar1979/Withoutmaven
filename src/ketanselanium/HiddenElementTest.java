package ketanselanium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class HiddenElementTest {
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }
    @Test
    public void main()throws Exception {
        WebElement element = driver.findElement(By.id("displayed-text"));
        System.out.println(element.isDisplayed());
        WebElement hideboxtext = driver.findElement(By.id("hide-textbox"));
        hideboxtext.click();
        System.out.println(element.isDisplayed());

        WebElement showbox = driver.findElement(By.id("show-textbox"));
        Thread.sleep(2000);
        showbox.click();

        System.out.println(element.isDisplayed());

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}