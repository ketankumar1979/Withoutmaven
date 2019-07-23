package ketanselanium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExceptionHandling {
    WebDriver driver;
    @Before
    //1.Timing Issue
    public void setup(){
        driver = new FirefoxDriver();
        //driver.get("https://letskodeit.teachable.com/");
        driver.get("https://ui.freecrm.com/");
        driver.manage().window().maximize();
        //implicit waiit
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
   // @Test
    //Example of Explicit timeout
   // public void test(){
        //driver.findElement(By.linkText("Login")).click();
       // WebDriverWait wait = new WebDriverWait(driver,3);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email"))).sendKeys("ketan");
        //2. incorrect locator or type of locator
        // always inspect locator on current page do not copy from earlier
        //3. Element is in iframe.
        // please use switch to farame method
    @Test
    //4. Difficult to click on element as of loading site
    // u can ust wait.disability method if u know what been clicking
    public void test(){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[3]/ul/a"))).click();


        driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("ketan");







    }
}
