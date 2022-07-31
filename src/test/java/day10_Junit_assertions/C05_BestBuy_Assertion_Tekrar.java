package day10_Junit_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C05_BestBuy_Assertion_Tekrar {
     static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void urlTest(){
        driver.get("https://www.bestbuy.com/");
        String er = "https://www.bestbuy.com/";
        String ar = driver.getCurrentUrl();
        Assert.assertEquals(er,ar);
    }

    @Test
    public void titleTest(){
        String wantedWords="Rest";
        String actualTitle=driver.getTitle();
        Assert.assertFalse(actualTitle.contains(wantedWords));
    }

    @Test
    public void logoTest(){
        WebElement logo = driver.findElement(By.xpath("(//img[@alt=\"Best Buy Logo\"])[1]"));
        Assert.assertTrue("logo görünmedi",logo.isDisplayed());
    }

    @Test
    public void fRis(){
        WebElement fR = driver.findElement(By.xpath("//button[@lang=\"fr\"]"));
        Assert.assertTrue("fr görünmedi",fR.isDisplayed());
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }

}
