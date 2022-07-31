package day04_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

//Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
//Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
//Daha sonra Amazon sayfasina gidin https://www.amazon.com/
//Youtube sayfasina geri donun
//Sayfayi yenileyin
//Amazon sayfasina donun
//Sayfayi tamsayfa yapin
//Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
//Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
//URL'yi yazdırın
//Sayfayi  kapatin

public class C01_Examples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://www.youtube.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String ER = "youtube";
        String ternary = (driver.getTitle().equals(ER)) ? "PASSED" : "FAILED!\tYoutube is actual result.";
        System.out.println(ternary);

        String ternary1 = driver.getCurrentUrl().contains("youtube") ? "PASSED!" : driver.getCurrentUrl();
        System.out.println(ternary1);
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        String ternary2 = driver.getTitle().equals("Amazon") ? "PASSED!" : "FAILED!\t" + driver.getTitle();
        System.out.println(ternary2);
        String ternary3 = driver.getCurrentUrl().contains("https://www.amazon.com/") ? "PASSED!" : driver.getCurrentUrl();
        System.out.println(ternary3);
        Thread.sleep(2000);
        driver.close();


    }
}
