package ketanselanium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class NavigateWebPageTest {
WebDriver driver;
    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://www.tesco.com/");
    }
    @Test
    public void main() throws Exception {
        String navigatetourl = "https://secure.tesco.com/account/en-G";
        driver.navigate().to(navigatetourl);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        String currenturl = driver.getCurrentUrl();
        System.out.println("currenturl is "+ currenturl);

    }
    @After
    public void tearDown() throws Exception {
        driver.quit();


    }
}