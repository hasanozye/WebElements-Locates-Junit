package day04_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
//http://a.testaddressbook.com/ adresine gidiniz.
//Sign in butonuna basin
//email textbox,password textbox, and signin button elementlerini locate ediniz..
//Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//Username :testtechproed@gmail.com
//Password : Test1234!
//Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
//“Addresses” ve “Sign Out” textlerinin göruntulendiğini( displayed) doğrulayin(verify).
//Sayfada kac tane link oldugunu bulun.

public class C02_Webelement_Get_Methot {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =  new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://a.testaddressbook.com/");
        WebElement element = driver.findElement(By.id("sign-in"));
        element.click();

        WebElement email = driver.findElement(By.id("session_email"));
        WebElement password = driver.findElement(By.id("session_password"));
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");

        WebElement signIn= driver.findElement(By.name("commit"));
        signIn.click();

        String userID = driver.findElement(By.className("navbar-text")).getText();
        String ternary = "testtechproed@gmail.com".equals(userID) ? "PASSED!" : "FAILED!\t "+userID;
        System.out.println(ternary);

        WebElement address = driver.findElement(By.linkText("Addresses"));
        if (address.isDisplayed()){
            System.out.println("Test PASS address");
        }else {
            System.out.println("Test Fail element görüntülenemedi...");
        }

        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        if (signOut.isDisplayed()){
            System.out.println("Test PASS signout");
        }else {
            System.out.println("TEST FAIL! element görüntülenemedi...");
        }
        List<WebElement> tagSayisi = driver.findElements(By.tagName("a"));
        System.out.println("tagSayisi = " + tagSayisi.size());


    }
}
