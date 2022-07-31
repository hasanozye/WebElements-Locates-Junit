package day09_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Junit03 {
    WebDriver driver;

    @Test
    public void test01(){
        //amazon ' a git, title al doğrulama yap
        driver.get("https://www.amazon.com");
        String title = driver.getTitle();
        String ER="Amazon";
        /*
        String ternary = title.contains(ER) ? "Amazon TESTİ PASS" : "Amazon TESTİ FAIL!";
        System.out.println(ternary);

         */
    }

    @Test
    public void test02(){
        //google ' a git, title al doğrulama yap

        driver.get("https://www.google.com");
        String gTitle= driver.getTitle();
        String ER="Google";
        String  ternary = gTitle.contains(ER) ? "Google TESTİ PASS" : "Google TESTİ FAIL!!";
        System.out.println(ternary);

    }

    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("SİSTEM IS STARTING TO WORK");
    }

    @After
    public void fix() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();

        System.out.println("SYSTEM IS TRYING TO MAKE THINGS WORK.");
    }



}
