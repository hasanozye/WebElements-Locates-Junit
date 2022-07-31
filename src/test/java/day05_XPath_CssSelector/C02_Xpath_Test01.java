package day05_XPath_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C02_Xpath_Test01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
        WebElement addElement = driver.findElement(By.xpath("//*[.=\"Add Element\"]"));
        addElement.click();
        Thread.sleep(2000);
        WebElement delete= driver.findElement(By.xpath("//*[.=\"Delete\"]"));
        System.out.println("delete.isDisplayed() = " + delete.isDisplayed());

        WebElement delete2= driver.findElement(By.xpath("//*[.=\"Delete\"]"));
        delete2.click();
        Thread.sleep(2000);

        WebElement addRemove= driver.findElement(By.xpath("//*[.=\"Add/Remove Elements\"]"));
        System.out.println("addRemove.isDisplayed() = " + addRemove.isDisplayed());

        driver.close();


    }
}
