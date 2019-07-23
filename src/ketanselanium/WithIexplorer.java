package ketanselanium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WithIexplorer {
    public static void main(String[]args){
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com/");
        driver.close();



    }
}
