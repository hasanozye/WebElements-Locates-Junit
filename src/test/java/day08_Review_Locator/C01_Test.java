package day08_Review_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class C01_Test {
    public static void main(String[] args) {
        /*
!          <div class="nav-fill">
!        <div class="nav-search-field ">
!        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder=""
!        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">  </div>
!      <a class="gb_d" data-pid="23" href="https://mail.google.com/mail/&amp;ogbl" target="_top">Gmailecom</a>
        */
        //todo
        // 1 Id =>twotabsearchtextbox
        // 2. name => field-keywords
        // 3 classname =>input nav-progressive-attribute
        // 4. Tagname =>//a,//input
        // 5. Linktext =>Gmailecom
        // 6. partil linntext=Gmaile,mail,mailecom
        // 7.Xpath relative hemde absolut xpat /html/body//div/div[1]//div/form/div[2//input,//input[@id="twotabsearchtextbox"]
        // 8. cssLocate input[id="twotabsearchtextbox"]  id=> #twotabsearchtextbox class=>.nav-input nav-progressive-attribute

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.amazon.com");
        driver.findElements(By.id("twotabsearchtextbox"));
        driver.findElement(By.name("field-keywords"));
        driver.findElement(By.className("nav-input nav-progressive-attribute"));
        driver.findElement(By.tagName("input"));
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        driver.findElement(By.cssSelector("input#twotabsearchtextbox"));






    }
}
