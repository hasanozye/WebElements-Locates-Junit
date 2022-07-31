import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class HasanOzyerOdev {
    static WebDriver driver;
    //todo
    //  https://www.youtube.com/ adresine gidin
    // ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
    // imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    // ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    // ○ wrongTitleTest  => Sayfa basliginin “youtube” olmadigini dogrulayin

    @Before
    public static void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Test
    public static void yT(){
        driver.get("https://www.youtube.com/");
        String  aR = driver.getTitle();
        String eR =  "YouTube";
        Assert.assertEquals(eR,aR);

    }



    }

