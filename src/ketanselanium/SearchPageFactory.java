package ketanselanium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
    WebDriver driver= null;

    @FindBy(id="bmwradio")
    WebElement bmwradio;

    @FindBy(id="benzradio")
    WebElement benzradio;

    public SearchPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
    public void clickradio(){
        bmwradio.click();
    }
    public void clickbenz(){
        benzradio.click();
    }

}
