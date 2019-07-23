package ketanselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
    public static void main (String[]args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.argos.co.uk/");
        driver.findElement(By.id("searchTerm")).sendKeys("nike",Keys.RETURN);
       // driver.findElement(By.cssSelector("div[class='ac-product-image']"));
        driver.close();


//        System.out.println(title);
       // if (title.equals("Google")){
           // System.out.println("correct title");

        //}
        //else {
           // System.out.println("Wrong title");
        //}
        }
    }

