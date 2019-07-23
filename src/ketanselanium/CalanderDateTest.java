package ketanselanium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

public class CalanderDateTest {
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.get("https://www.expedia.co.uk/");
        driver.manage().window().maximize();
    }

    @Test
    public void test(){
        driver.findElement(By.id("tab-flight-tab-hp")).click();
        driver.findElement(By.id("flight-departing-hp-flight")).click();
        driver.findElement(By.xpath("//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table"));
        driver.findElement(By.xpath("//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table/tbody/tr[5]/td[5]/button"));
        driver.quit();





    }
}

