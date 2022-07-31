package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver03_Methotlar_Manage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.amazon.com");
        /*
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
         */

        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        Thread.sleep(2000);
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        Thread.sleep(2000);
        driver.manage().window().setPosition(new Point(250,400));
        Thread.sleep(2000);
        System.out.println("driver.manage().window().setPosition() = " + driver.manage().window().getPosition());
        Thread.sleep(2000);
        driver.manage().window().setSize(new Dimension(400, 400));
        System.out.println("driver.manage().window().setSize() = " + driver.manage().window().getSize());
        Thread.sleep(2000);
        driver.close();

    }
}
