package ketanselanium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Random;
import java.util.RandomAccess;

public class AutoSelect {
    WebDriver driver;

    @Before
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://www.southwest.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void test(){
       WebElement element =  driver.findElement(By.id("LandingPageAirSearchForm_originationAirportCode"));
       element.sendKeys("new york");
        List<WebElement> result = element.findElements(By.xpath("//*[@id=\"TabbedArea_4-panel-0\"]/div/div/form/div[2]/div[1]/div[1]/label/div[3]"));
        for(WebElement result1 : result){
            if (result1.getText().equals("New York/Newark, NJ-EWR")){
                result1.click();

            }
        }

    }
    @After
    public void teardown(){
           ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    }


}
