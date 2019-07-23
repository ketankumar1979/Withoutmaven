package ketanselanium.ExtentReport;
import java.util.concurrent.TimeUnit;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;


public  class ExtentDemo1 {
      WebDriver driver;
      ExtentTest test;
     ExtentReports report;

    @Before
    public  void setup() {

        report = new ExtentReports("C://Users//ketan//Desktop//login test.html");
        test = report.startTest("verify clicking radio button");
       // driver = new FirefoxDriver();
       // test.log(LogStatus.INFO, "open the firefox browser");
       // driver.get("https://learn.letskodeit.com/p/practice");
       // test.log(LogStatus.INFO, "open the URL");
    }
        @Test
        public void test()throws Exception{

           WebDriver driver = new FirefoxDriver();
            test.log(LogStatus.INFO, "open the firefox browser");
            driver.get("https://learn.letskodeit.com/p/practice");
            test.log(LogStatus.INFO, "open the URL");

            driver.findElement(By.id("bmwradio")).click();
            test.log(LogStatus.INFO,"click bmwradi");

            driver.findElement(By.id("benzradio")).click();
            test.log(LogStatus.INFO, "click benzradio");

        }
    @After
    public  void teardown()throws Exception{
            report.flush();
    }
}
