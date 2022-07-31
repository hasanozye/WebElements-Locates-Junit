package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver05_Methotlar_Navigate {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();


        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.netflix.com");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);


        driver.close();


        //driver.navigate().to("https://www.amazon.com");

    }
}
