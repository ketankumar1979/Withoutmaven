package ketanselanium;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectModel {
    WebDriver driver;
    @Before
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        driver.manage().window().maximize();
    }


   @Test
    public void test(){

       SearchHomePage.bmwradio(driver).click();
       SearchHomePage.benzradio(driver).click();


   }

   }






