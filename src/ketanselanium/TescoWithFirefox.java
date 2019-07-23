package ketanselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TescoWithFirefox {
    public static void main (String[]args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.tesco.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[title=\"Sign in\"]")).click();
    }
}
