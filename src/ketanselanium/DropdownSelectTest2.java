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

public class DropdownSelectTest2 {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://www.expedia.co.uk/");
    }


    @Test
    public void main()throws Exception {
       WebElement element = driver.findElement(By.id("package-advanced-preferred-class-hp-package"));
        Select sel = new Select(element);
        sel.selectByIndex(0);
        Thread.sleep(2000);
        sel.selectByIndex(1);
        Thread.sleep(2000);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByIndex(3);


        List<WebElement> options = sel.getOptions();
        int size = options.size();
        for (int i=0;i<size;i++){
            String optionname = options.get(i).getText();
            System.out.println(optionname);
        }


    }
    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}