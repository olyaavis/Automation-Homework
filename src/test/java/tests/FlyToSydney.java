package tests;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class FlyToSydney extends BaseTest{

	
	@Test(priority=1)
	public static void navigateToHomePage(){
		driver.get("https://www.expedia.com/");
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	@Test(priority=2)
	public static void getToFlightPage(){
	//	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("tab-flight-tab-hp")).click();
	}
	@Test(priority=3)
	public static void setFlyingFromField(){
		driver.findElement(By.id("flight-origin-hp-flight")).click();
        driver.findElement(By.id("flight-origin-hp-flight")).clear();
        driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("Tel Aviv, Israel (TLV-Ben Gurion");
	}
	@Test(priority=4)
	public static void setFlyingToField(){
		 driver.findElement(By.id("flight-destination-hp-flight")).click();
	     driver.findElement(By.id("flight-destination-hp-flight")).clear();
	     driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("Sydney, NSW, s(SYD-Kingsford Smith Intl.)");
	}
	@Test(priority=5)
	public static void setDepartingDate(){
        driver.findElement(By.id("flight-departing-hp-flight")).click();
        driver.findElement(By.id("flight-departing-hp-flight")).clear();
        driver.findElement(By.id("flight-departing-hp-flight")).sendKeys("11/03/2017");

	}
	@Test(priority=6)
	public static void setReturningDate(){
		driver.findElement(By.id("flight-returning-hp-flight")).click();
		driver.findElement(By.id("flight-returning-hp-flight")).clear();;
		driver.findElement(By.id("flight-returning-hp-flight")).sendKeys("12/02/2017");
		
	}
	@Test(priority=7)
	public static void clickSearchButton(){
		driver.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[normalize-space(.)='Search']")).click();
				}
	@Test(priority=8)
	public static void verifySearchResults(){
		assertTrue(driver.findElements(By.cssSelector("button.btn-secondary")).size()>1);
		
	}
	}


