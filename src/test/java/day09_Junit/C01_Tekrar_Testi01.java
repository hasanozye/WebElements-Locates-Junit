package day09_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C01_Tekrar_Testi01 {
    public static void main(String[] args) throws InterruptedException {
        //todo
        // 1. “https://www.saucedemo.com/ Adresine gidin
        // 2. Username kutusuna “standard_user” yazdirin+
        // 3. Password kutusuna “secret_sauce” yazdirin
        // 4 . Login tusuna basin
        // 5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        // 6. Add to Cart butonuna basin
        // 7. Alisveris sepetine tiklayin
        // 8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        // 9. Sayfayi kapatin

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce", Keys.ENTER);
        WebElement firstItem = driver.findElement(By.xpath("(//div[@class=\"inventory_item_name\"])[1]"));
        System.out.println("firstItem = " + firstItem.getText());
        Thread.sleep(2000);
        firstItem.click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@*=\"shopping_cart_link\"]")).click();
        Thread.sleep(2000);
        int qty = Integer.parseInt(driver.findElement(By.xpath("//div[@class=\"cart_quantity\"]")).getText());
        String ternary = qty >= 1 ? "Succesfull. It is added" : "Not successfull. Your bag is empty biaatch!";
        System.out.println("Is ıt added? " + ternary);
        driver.close();


    }
}
