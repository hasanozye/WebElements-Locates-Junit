package day07_RelativeLocator_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
//*  1. https://trytestingthis.netlify.app/ sayfasina gidin
//*  2. Kullanıcı adı "test" giriniz
//*  3.  Password olarak "test" giriniz
//*  4.  Login butonuna tiklayiniz
//*  5.  "Login Successful :)" texti gorunur ise Pass yazdırın
//*  6. Textin içindeki "Click here to go back to the home page" !<"here">! tiklayın
//*  7.  Ana sayfadaki "This is your layout two" görünürlüğünü test edin.

public class C02_Tekrar {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://trytestingthis.netlify.app/");
        Thread.sleep(3000);
        driver.findElement(By.id("uname")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.id("pwd")).sendKeys("test",Keys.ENTER);
        Thread.sleep(2000);
        boolean smileyFace = driver.findElement(By.xpath("//h2")).isDisplayed();
        String smileyFaceString= smileyFace ? "Pass" : "It didn't displayed";
        System.out.println(smileyFaceString);
        driver.findElement(By.xpath("//a[text()=\"here\"]")).click();
        boolean isIt =driver.findElement(By.xpath("(//h2)[2]")).isDisplayed();
        String isItSt = isIt ? "It is displayed" : "It is not displayed";
        System.out.println(isItSt);




    }
}
