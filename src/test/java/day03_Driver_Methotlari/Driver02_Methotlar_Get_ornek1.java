package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver02_Methotlar_Get_ornek1 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.netflix.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getPageSource() = " + driver.getPageSource());
        driver.close();


    }
}
