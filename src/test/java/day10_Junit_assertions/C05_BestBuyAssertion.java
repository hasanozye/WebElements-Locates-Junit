package day10_Junit_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C05_BestBuyAssertion {
    WebDriver driver;
    //todo
    // https://www.bestbuy.com/ A dresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
    // ○Sayfa URL’inin https://www.bestbuy.com/ com/‘a esit oldugunu test edin
    // ○titleTest => Sayfa başlığının “ Rest” içer me diğini(contains) test edin
    // ○logoTest => BestBuy logosunun görüntülen digini test edin
    // ○Francais LinkTest => Fransizca Linkin görüntüle n diğini test edin

    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test
    public void bestBuy(){
        driver.get("https://www.bestbuy.com/");
        String er = "https://www.bestbuy.com/";
        String ar = driver.getCurrentUrl();
        Assert.assertEquals(er,ar);

        String wantedWords="Rest";
        String actualTitle=driver.getTitle();
        Assert.assertFalse(actualTitle.contains(wantedWords));

        WebElement logo = driver.findElement(By.xpath("(//img[@alt=\"Best Buy Logo\"])[1]"));
        Assert.assertTrue("logo görünmedi",logo.isDisplayed());

        WebElement fR = driver.findElement(By.xpath("//button[@lang=\"fr\"]"));
        Assert.assertTrue("fr görünmedi",fR.isDisplayed());

    }

}
