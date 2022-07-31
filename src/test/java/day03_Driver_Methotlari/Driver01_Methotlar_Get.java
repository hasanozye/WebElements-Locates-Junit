package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver01_Methotlar_Get {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.paypal.com");
        driver.get("https://www.amazon.com");

        System.out.println("driver.getTitle = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());
        Thread.sleep(4000);
        driver.close();
    }
}
