package ketanselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class GetValue{

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.tesco.com/");
        WebElement element = driver.findElement(By.xpath("//a[@title='Sign in']"));
        String value = element.getAttribute("class");
        System.out.println(value);



    }
}
