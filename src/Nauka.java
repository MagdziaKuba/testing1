package newproject;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class Nauka {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com//";
        String tagName = "";
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        WebDriverWait myWaitVar= new WebDriverWait(driver,60);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));

        driver.findElement(By.name("email")).sendKeys("mmmm");
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
        driver.findElement(By.name("pass")).sendKeys("ddd");
    }
}