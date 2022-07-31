package day07_RelativeLocator_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Arrays;
// https://www.google.com/ adresine gidin
//Sayfa basliginin “Google” ifadesi icerdigini test edin
//Arama cubuguna “Nutella” yazip aratin
//Bulunan sonuc sayisini yazdirin
//sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
//Sayfayi kapatin

public class C04_TekrarTesti {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://www.google.com/");
        String  AR ="Google";
        String ER =driver.getTitle();
        String erCAr= ER.contains(AR) ? "TEST PASS!" : "TEST FAIL AR is: " + driver.getTitle();
        System.out.println(erCAr);
        driver.findElement(By.xpath("//input[@class =\"gLFyf gsfi\"]")).sendKeys("Nutella", Keys.ENTER);

        String  result =driver.findElement(By.xpath("//div[@*=\"result-stats\"]")).getText();
        System.out.println("result = " + result);

        String topSonuc[] =result.split(" ");
        String gercekSayi=topSonuc[1];
        System.out.println(gercekSayi);
        String sonHali=gercekSayi.replace(".","");
        int sayi = Integer.parseInt(sonHali);
        System.out.println(sayi);

        String eRcAr= sayi>10_000_000 ? "TEST PASS!" : "TEST FAIL!";
        System.out.println(eRcAr);
        driver.quit();





    }
}
