package day06_RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C02_TekrarTesti01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        String ER = "Spend less";
        String AR = driver.getTitle();
        String ternary = AR.contains(ER) ? "TEST PASS, IT CANTAINS THE ER!" : "TEST FAIL, IT DOES'NT HAVE IT."+driver.getTitle();
        System.out.println(ternary);
        driver.findElement(By.xpath("(//*[.=\"Gift Cards\"])[1]")).click();
        driver.findElement(By.xpath("//*[@alt=\"Birthday gift cards\"]")).click();
        driver.findElement(By.xpath("(//img[@alt=\"Amazon.com eGift Card\"])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@value=\"25\"]")).click();
        driver.findElement(By.xpath("(//img[@class=\"gc-design-img-preview\"])[1]")).click();

        String toVerify2=driver.findElement(By.xpath("//*[@style=\"line-height: 40px;\"]")).getText();
        if (toVerify2.equals("$25.00")){
            System.out.println("Yeap, test pass! it displays as 25 dollas");
        }else {
            System.out.println("Nope, test fail. The right answer is: "+toVerify2);
        }






    }
}
