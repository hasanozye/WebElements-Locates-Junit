package day04_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C02_Webelement_Get_Is_Methot {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("http://edabit.com");
        WebElement signin=driver.findElement(By.tagName("a"));
        /*
        WebElement signin = driver.findElement(By.linkText("Sign in"));
        System.out.println("signin.getText() = " + signin.getText());
        System.out.println("signin.getTagName() = " + signin.getTagName()); //* Webelementinizin Taf ini verir.
        //System.out.println("signin.getAriaRole() = " + signin.getAriaRole());
        System.out.println("signin.getAttribute() = " + signin.getAttribute("id"));
        System.out.println("signin.getRect().width = " + signin.getRect().width);
        System.out.println("signin.getRect().height = " + signin.getRect().height);
        System.out.println("signin.getCssValue() = " + signin.getCssValue("color"));

         */
        System.out.println("signin.getText() = " + signin.getText());
        System.out.println("signin.getAttribute() = " + signin.getAttribute("tagname"));
        System.out.println("signin.getRect().width = " + signin.getRect().width);
        System.out.println("signin.getRect().height = " + signin.getRect().height);
        System.out.println("signin.getCssValue() = " + signin.getCssValue("color"));
        System.out.println("signin.isEnabled() = " + signin.isEnabled());
        System.out.println("signin.isSelected() = " + signin.isSelected());


    }
}
