package day08_Review_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C02_Tekrar_Testi {
    public static void main(String[] args) throws InterruptedException {
        //todo
        // 1- https://www.facebook.com/ adresine gidin
        //  2- cookies cikarsa kabul et butonuna basin
        // 3- e-posta kutusuna rastgele bir mail girin
        // 4- sifre kismina rastgele bir sifre girin
        // 5- giris yap butonuna basin
        // 6- uyari olarak "The email or mobile number you entered isn’t connected to an account.
        // Find your account and log in. “ mesajinin ciktigini test edin
        // 7- sayfayi kapatin

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("merhabaheheh0876@yahoo.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#pass")).sendKeys("12345", Keys.ENTER);
        Thread.sleep(1000);
        String text = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]")).getText();
        String textOp = text.contains("Girdiğin e-posta bir hesaba bağlı değil. Hesabını bul ve giriş yap.") ? "TEST PASS!" : "TEST FAILED " + text;
        System.out.println(textOp);
        Thread.sleep(1000);
        driver.quit();


    }
}
