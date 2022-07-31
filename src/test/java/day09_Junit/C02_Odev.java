package day09_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class C02_Odev {
   static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {


        //todo
        // 1- https://www.amazon.com/ sayfasina gidelim
        // 2- arama kutusunu locate edelim
        // 3- “iphone ” ile arama yapalim
        // 4 - Bulunan sonuc sayisini yazdiralim
        // 5- Ilk urunu tiklayalim
        // 6- Bir onceki sayfaya donup,sayfadaki tum basliklari  yazdiralim
        // 7 3. sayfaya kadar yazdıralım.

        WebDriverManager.firefoxdriver().setup();
         driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        String results = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"])[1]")).getText();
        System.out.println("results = " + results);
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@*=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        WebElement next = driver.findElement(By.xpath("//*[*=\"Next\"]"));


        //1.sayfa basliklar
        basliklar();
        next.click();
        //2.sayfa basliklar
        basliklar();
        Thread.sleep(5000);
        next.click();

        //3.sayfa basliklar
        basliklar();



    }
    public static void basliklar() throws InterruptedException {
        List<WebElement> elements = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));

        int count = 0;
        for (WebElement titles : elements) {
            System.out.println((count + 1) + ".titles.getText() = " + titles.getText());
            count++;
        }
        Thread.sleep(2000);

        System.out.println("------------------------------o--------------------------------");


    }




}
