package ketanselanium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDemo {
    public static void main (String[]args)throws MalformedURLException{

        DesiredCapabilities caps =  DesiredCapabilities.chrome();
        caps.setBrowserName("chrome");
        caps.setPlatform(Platform.WIN10);
        //driver = new RemoteWebDriver(new URL(nodeurl),caps);
        // ChromeOptions options = new ChromeOptions();
        //options.merge(caps);
        //String huburl = "http://192.168.0.7:7070/wd/hub";
        URL url = new URL("http://192.168.0.7:7070/wd/hub");
        WebDriver driver = new RemoteWebDriver(url,caps);
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

    }
   // @Test
    //public void test(){
      //  driver.switchTo().frame(0);
        //WebElement fromelement = driver.findElement(By.id("draggable"));
        //WebElement toelement = driver.findElement(By.id("droppable"));
        //Actions action = new Actions(driver);
        // action.dragAndDrop(fromelement,toelement).build().perform();
        //action.clickAndHold(fromelement).moveToElement(toelement).release().build().perform();

    //}
}

    //}
//}
