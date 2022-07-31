package day05_XPath_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C01_CssSelector {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("http://a.testaddressbook.com/sign_in");
        WebElement email = driver.findElement(By.cssSelector("#session_email"));
        WebElement password = driver.findElement(By.cssSelector("#session_password"));
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        WebElement signIn = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
        signIn.click();



    }
}
