package ketanselanium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Pagefactory {
    WebDriver driver;
    SearchPageFactory object;

    @Before
    public void getsetup(){
         driver = new FirefoxDriver();
        object = new SearchPageFactory(driver);
        driver.get("https://learn.letskodeit.com/p/practice");


    }

    @Test
    public void test(){
        object.clickbenz();
        object.clickradio();

    }
}
