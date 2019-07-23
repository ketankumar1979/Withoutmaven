package ketanselanium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class SwitchWindow {
    WebDriver driver;

   @Before
    public void setup(){
       driver = new FirefoxDriver();
       driver.get("https://learn.letskodeit.com/p/practice");
       driver.manage().window().maximize();
   }
   @Test
    public void test()throws Exception{
       String parenthandle = driver.getWindowHandle();

       driver.findElement(By.id("openwindow")).click();
       Set<String> handles = driver.getWindowHandles();
       for (String handle : handles){
           System.out.println(handle);
           if(!handle.equals(parenthandle)) {
               driver.switchTo().window(handle);
               Thread.sleep(2000);
               driver.findElement(By.id("search-courses")).sendKeys("python");
               Thread.sleep(2000);
               driver.close();

           }
       }



       driver.switchTo().window(parenthandle);
       driver.findElement(By.id("name")).sendKeys("ketan");
       driver.quit();

       }
   }


