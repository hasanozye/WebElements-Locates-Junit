package day10_Junit_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C01_Checkbox {
    WebDriver driver;
    //todo
    // a. Verilen web sayfasına gidin.
    // https://the-internet.herokuapp.com/checkboxes
    // b. Checkbox1 ve checkbox2 elementlerini locate edin.
    // c. Checkbox1 seçili değilse onay kutusunu tıklayın
    // d. Checkbox2 seçili değilse onay kutusunu tıklayın
    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1=driver.findElement(By.xpath("(//input[@*=\"checkbox\"])[1]"));
        WebElement checkBox2=driver.findElement(By.xpath("(//input[@*=\"checkbox\"])[2]"));
        Thread.sleep(5000);

        Assert.assertTrue(checkBox1.isSelected());

        Assert.assertTrue(checkBox2.isSelected());

        /*if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        if (!checkBox2.isSelected()){
            checkBox2.click();
        }

         */

        Thread.sleep(3000);
    }

    @After
    public void tearDown(){
        driver.close();
    }


}
