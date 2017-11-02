import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class Selenium {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void Selenium() {
        wd.get("https://www.expedia.com/");
        wd.findElement(By.id("tab-flight-tab-hp")).click();
        wd.findElement(By.id("flight-origin-hp-flight")).click();
        wd.findElement(By.id("flight-origin-hp-flight")).clear();
        wd.findElement(By.id("flight-origin-hp-flight")).sendKeys("tel ");
        wd.findElement(By.id("flight-destination-hp-flight")).click();
        wd.findElement(By.id("flight-destination-hp-flight")).clear();
        wd.findElement(By.id("flight-destination-hp-flight")).sendKeys("Sydney, NSW, s(SYD-Kingsford Smith Intl.)");
        wd.findElement(By.id("flight-destination-hp-flight")).click();
        wd.findElement(By.id("flight-destination-hp-flight")).clear();
        wd.findElement(By.id("flight-destination-hp-flight")).sendKeys("syd");
        wd.findElement(By.xpath("//div[@class='datepicker-cal']//button[.='3']")).click();
        wd.findElement(By.id("flight-returning-hp-flight")).click();
        wd.findElement(By.xpath("//div[@class='datepicker-cal']/div[3]/table/tbody/tr[2]/td[1]/button")).click();
        wd.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[normalize-space(.)='Search']")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
