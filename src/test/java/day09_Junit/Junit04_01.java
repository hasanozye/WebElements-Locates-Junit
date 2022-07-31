package day09_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.security.Key;
import java.time.Duration;

public class Junit04_01 {
    WebDriver driver;
    //todo
    // amazona gidilsin
    // arama butonuna nutella yazılsın
    // title nutelle var mı kontrol edilsin
    // amazona gidilsin
    // arama butonuna java yazılsın
    // title da java var mı kontrol edilsin
    // amazona gidilsin
    // arama butonuna ali yazılsın
    // title da ali var mı kontrol edilsin

    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Test
    public void test01(){
        driver.navigate().to("https://amazon.com");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("nutella", Keys.ENTER);
        System.out.println("driver.getTitle() = " + driver.getTitle());

    }
    @Test
    public void testJava(){
        driver.get("https://amazon.com");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("java",Keys.ENTER);
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @Test
    public void testAli(){
        driver.get("https://amazon.com");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("ali", Keys.ENTER);
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }

    @After
    public void finish() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();

    }



}
