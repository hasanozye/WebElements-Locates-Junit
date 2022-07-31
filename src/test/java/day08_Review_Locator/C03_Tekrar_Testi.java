package day08_Review_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

import static com.beust.jcommander.DefaultUsageFormatter.s;

public class C03_Tekrar_Testi {
    //todo
    // 1- https://www.bestbuy.com/ adresine gidin
    // 2- cookies cikarsa kabul et butonuna basin
    // 3- sayfada kac adet button bulundugunu yazdirin
    // 4- sayfadaki herbir button uzerindeki yazilari yazdirin
    // 5- sayfadaki herbir Bayrak altındaki  yazilari yazdirin
    // 6- sayfadakiUnidetb Statesin yerini Realtive locater ile belirleyiniz.
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.bestbuy.com/");
        List<WebElement> s = driver.findElements(By.tagName("button"));
        System.out.println(s.size());

        List<WebElement> buttonAll=driver.findElements(By.tagName("button"));
        for (WebElement buttonyazi:buttonAll){
            System.out.println("buttonyazi.getText() = " + buttonyazi.getText());
        }
        List<WebElement> yazilar= driver.findElements(By.xpath("(//div[@class=\"country-selection\"])[1]"));
        for (WebElement btyazi:yazilar){
            System.out.println("btyazi.getText() = " + btyazi.getText());

        }
        System.out.println("yazilar.size() = " + yazilar.size()+" adet vardır.");

        /*String cN=driver.findElement(By.xpath("(//*[.=\"Canada\"])[1]")).getText();
        System.out.println("cN = " + cN);
        String uS = driver.findElement(By.xpath("(//*[.=\"United States\"])[1]")).getText();
        System.out.println("uS = " + uS);
        String mX = driver.findElement(By.xpath("(//*[.=\"Mexico\"])[1]")).getText();
        System.out.println("mX = " + mX);

         */

        WebElement uS = driver.findElement(By.xpath("//img[@alt=\"United States\"]"));
        WebElement cN= driver.findElement(By.xpath("//img[@alt=\"Canada\"]"));
        WebElement mX = driver.findElement(By.xpath("//img[@alt=\"Mexico\"]"));
        String usStr= uS.getAttribute("alt");
        System.out.println("usStr = " + usStr);

        WebElement unitedStates = driver.
                findElement(RelativeLocator.with(By.tagName("img")).
                        toRightOf(cN).toLeftOf(mX));
        System.out.println("unitedStates.Attribute() = " + unitedStates.getAttribute("alt"));

        if (usStr.equals(unitedStates.getAttribute("alt"))){
            System.out.println("TEST PASS");
        }else {
            System.out.println("TEST FAIL");
        }


    }
}
