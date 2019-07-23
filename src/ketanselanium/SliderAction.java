package ketanselanium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {
    WebDriver driver;
    @Before
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://jqueryui.com/slider/");
        driver.manage().window().maximize();

    }
    @Test
    public void test(){
        driver.switchTo().frame(0);
        WebElement element=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(element,600,0).perform();

    }
}
