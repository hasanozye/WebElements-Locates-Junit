package day04_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://a.testaddressbook.com");

        //Sign in butonuna basma
        WebElement signing = driver.findElement(By.id("sign-in"));
        signing.click();

        //e-mail bulma
        WebElement email = driver.findElement(By.name("session[email]"));
        email.sendKeys("testtechproed@gmail.com");


        //password bulma
        WebElement password = driver.findElement(By.name("session[password]"));
        password.sendKeys("Test1234!");

        WebElement signIn = driver.findElement(By.name("commit"));
        signIn.click();


        WebElement verify = driver.findElement(By.className("navbar-text"));
        String er = "testtechproed@gmail.com";
        String actual = driver.findElement(By.className("navbar-text")).getText();
        if (er.equals(actual)) {
            System.out.println("Test pass");
        } else {
            System.out.println("Test FAILED");
            System.out.println(actual);
        }

        WebElement adres = driver.findElement(By.linkText("Addresses"));
        WebElement out = driver.findElement(By.linkText("Sign Out"));

        if (adres.isDisplayed()) {
            System.out.println("Test PASS");
        } else {
            System.out.println("Test Failed element görüntülenemedi.");
        }

        List<WebElement> tagSayisi = driver.findElements(By.tagName("a"));
        System.out.println("tagSayisi = " + tagSayisi.size());


        //driver.close();

        /*
        * Thread.sleep(4000);
        driver.close();

         */


    }
}
