package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver06_ImlicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();


        driver.get("https://www.guidersoft.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Thread.sleep(3000);
        driver.close();
    }
}
