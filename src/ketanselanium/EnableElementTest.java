package ketanselanium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class EnableElementTest {
WebDriver driver;
    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
        WebElement element = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        
        System.out.println("element is enabled " + element.isEnabled());
    }
}