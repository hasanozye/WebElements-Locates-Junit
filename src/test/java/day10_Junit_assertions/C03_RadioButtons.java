package day10_Junit_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class C03_RadioButtons {
    WebDriver driver;
    //todo
    // //https://www.facebook.com/ adresine gidin
    // //-“Create an Account” button’una basin
    //  //-“radio buttons” elementlerini locate edin
    //  //Secili degilse cinsiyet butonundan size uygun olani secin

    @Before
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void testFace() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
        List<WebElement> radioButtons = driver.findElements(By.xpath("//span[@data-name=\"gender_wrapper\"]"));
        Thread.sleep(2000);
        for (WebElement listButtons : radioButtons){
            System.out.println("listButtons.getText() = " + listButtons.getText());


        }
        WebElement male = driver.findElement(By.xpath("//input[@value=\"2\"]"));
        Thread.sleep(3000);
        if (!male.isSelected()){
            male.click();
        }




    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }

}
