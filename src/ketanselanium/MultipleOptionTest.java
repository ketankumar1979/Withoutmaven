package ketanselanium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.*;
public class MultipleOptionTest {
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
    }
    @Test
    public void main()throws Exception {
        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select sel = new Select(element);
        sel.selectByValue("apple");
        Thread.sleep(3000);
        sel.deselectByValue("apple");
        Thread.sleep(3000);
        sel.selectByIndex(1);
        Thread.sleep(3000);
        sel.selectByVisibleText("Peach");
        Thread.sleep(3000);
        List<WebElement> options = sel.getAllSelectedOptions();
        for(WebElement optionname : options){
            System.out.println(optionname.getText());
        }
        sel.deselectAll();


    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}