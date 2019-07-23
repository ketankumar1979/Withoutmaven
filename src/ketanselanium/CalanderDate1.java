package ketanselanium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class CalanderDate1 {

    WebDriver driver;

    @Before
   public void setup() throws Exception{
        driver = new FirefoxDriver();
        driver.get("https://www.expedia.co.uk/");
        driver.manage().window().maximize();

    }
    @Test
    public void test()throws Exception{
        driver.findElement(By.id("tab-flight-tab-hp")).click();
        driver.findElement(By.id("flight-departing-hp-flight")).click();
       WebElement element =  driver.findElement(By.xpath("//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table"));
        List<WebElement> getdates = element.findElements(By.tagName("a"));
        for (WebElement alldates : getdates){
        if(alldates.getText().equals("31")){
            alldates.click();
            break;
        }
        }
    }
}
