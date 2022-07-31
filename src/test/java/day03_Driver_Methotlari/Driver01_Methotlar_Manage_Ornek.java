package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver01_Methotlar_Manage_Ornek {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://guidersoft.com");
        Thread.sleep(2000);
        driver.manage().window().setPosition(new Point(80,12));
        Thread.sleep(2000);
        driver.manage().window().setSize(new Dimension(589,990));
        Thread.sleep(2000);
        System.out.println("driver.manage().window().setPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().setSize() = " + driver.manage().window().getSize());


    }
}
