package day05_XPath_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C01_Tekrar_Testi {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.navigate().to("https://www.amazon.com");
        WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
        searchBox.sendKeys("satoku victorinox", Keys.ENTER);
        WebElement glass = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"])[1]"));
        System.out.println("glass.getText() = " + glass.getText());
        WebElement pic = driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-square-aspect\"])[1]"));
        pic.click();

    }
}
