package day08_Review_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C04_Tekrar_Testi {
    public static void main(String[] args) throws InterruptedException {
        // TODO: 7/20/2022
        //* 1. Sayfaya gidiniz http://automationexercise.com/
        //* 2. Site logosunu test ediniz
        //* 3.'Signup / Login' button tıklayınız
        //* 4. email adres ve parola giriniz
        //* 5. Click 'login' yapınız
        //* 6. Delete Account yazısını doğrulayınız
        //* 7. Sayfadan 'Logout yapınız
        //* 8. lOGİN SAYFASINA GİDİLDİĞİNİ KONTROL EDİNİZ.
        //* 9. Close driver

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("http://automationexercise.com/");

        boolean logo = driver.findElement(By.xpath("//img[@*=\"Website for automation practice\"]")).isDisplayed();
        String  logoSt = logo ? "TEST PASS, LOGO IS DISPLAYED." : "TEST FAIL. The logo dıdn't displayed.";
        System.out.println("logoSt = " + logoSt);

        driver.findElement(By.xpath("//a[@*=\"/login\"]")).click();

        driver.findElement(By.xpath("//*[@data-qa=\"login-email\"]")).sendKeys("guidersoft@merhaba.com");
        driver.findElement(By.xpath("//*[@*=\"login-password\"]")).sendKeys("12345",Keys.ENTER);

        boolean delete= driver.findElement(By.xpath("//*[@*=\"/delete_account\"]")).getText().equals("Delete Account");
        String deleteSt = delete ? "TEST PASS, ER iis displayed" : "TEST FAIL, ER didn't displayed. ";
        System.out.println("deleteSt = " + deleteSt);

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@*=\"/logout\"]")).click();

        driver.quit();














    }
}
