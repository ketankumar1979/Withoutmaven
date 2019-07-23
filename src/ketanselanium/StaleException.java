package ketanselanium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleException {
WebDriver driver;


// Stale exception handling example
    //if you refresh the url then if u find same element then element will be stale.
    // if u do not put break on if loop then it will be stale as well.

@Before
    public void setup(){
    driver = new FirefoxDriver();
    driver.get("https://learn.letskodeit.com/p/practice");
    driver.manage().window().maximize();
}

@Test
    public void test(){
    WebElement element = driver.findElement(By.id("bmwcheck"));
    driver.get("https://learn.letskodeit.com/p/practice");
    element.click();

}
}
