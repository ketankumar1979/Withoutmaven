package ketanselanium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class RadioCheckBoxTest {
WebDriver driver;
    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void main() throws Exception {
        WebElement e1 =  driver.findElement(By.id("bmwradio"));
        e1.click();
        WebElement e2 =  driver.findElement(By.id("benzradio"));
        e2.click();
        System.out.println("Radio button is selected?" + e1.isSelected() );
        System.out.println("Radio button is selected?" + e2.isSelected() );
    }
}