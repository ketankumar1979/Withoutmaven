package ketanselanium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Withfirefox {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.className("_1Rz0y")).sendKeys("nike",Keys.RETURN);
        driver.findElement(By.cssSelector("img[src='//media.4rgos.it/s/Argos/8146241_R_SET?$Web$&$Main350$&w=238&h=238&qlt=70']")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/div[2]/section[2]/section/div[5]/div[2]/button")).click();





    }
}
