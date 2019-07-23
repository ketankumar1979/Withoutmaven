package ketanselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchHomePage {
    public static WebElement element = null;

    public static WebElement bmwradio(WebDriver driver){
        element = driver.findElement(By.id("bmwradio"));
        return element;
    }
    public static WebElement benzradio(WebDriver driver){
        element = driver.findElement(By.id("benzradio"));
        return element;
    }

}
