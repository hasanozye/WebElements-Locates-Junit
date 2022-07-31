package day07_RelativeLocator_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C01_RelativeLocator01 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // once uzerlerinden tarif yapacagimiz web elemntlerini locate etmeliyiz
        driver.navigate().to("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement berlin = driver.findElement(By.id("pid7_thumb"));
        WebElement byArea=driver.findElement(By.id("pid8_thumb"));
        WebElement Boston = driver.findElement(By.id("pid6_thumb"));
        WebElement nyc = driver.findElement(By.id("pid3_thumb"));
        // 2 ) Berlin’i  3 farkli relative locator ile locate edin
        WebElement berlin1=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(Boston).toLeftOf(byArea));
        WebElement berlin2=driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(byArea).below(nyc));
        WebElement berlin3=driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc).toRightOf(Boston));
        // 3 ) Relative Locator'larin dogru calistigini test edin
        String expectedBerlin=berlin.getAttribute("id");
        String actualBerlin1=berlin1.getAttribute("id");
        String actualBerlin2=berlin2.getAttribute("id");
        String actualBerlin3=berlin3.getAttribute("id");

        System.out.println("expectedBerlin = " + expectedBerlin);
        System.out.println("actualBerlin1 = " + actualBerlin1);
        System.out.println("actualBerlin2 = " + actualBerlin2);
        System.out.println("actualBerlin3 = " + actualBerlin3);

        String erEsittirAR1 = expectedBerlin.equals(actualBerlin1) ? "1.Relative locate TEST PASS" : "1.Relative locate FAILED";
        String erEsittirAR2 = expectedBerlin.equals(actualBerlin2) ? "2.Relative locate TEST PASS" : "2.Relative locate FAILED";
        String erEsittirAR3 = expectedBerlin.equals(actualBerlin3) ? "3.Relative locate TEST PASS" : "3.Relative locate FAILED";
        System.out.println();
        System.out.println(erEsittirAR1);
        System.out.println(erEsittirAR2);
        System.out.println(erEsittirAR3);


        // 3 ) Relative locator’larin dogru calistigini test edin

    }
}
