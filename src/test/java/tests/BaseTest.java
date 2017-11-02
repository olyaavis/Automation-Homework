package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseTest {
	public static WebDriver driver;
	

	@BeforeClass
	public static void setUp()throws Exception{
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	
		
	

	@AfterClass
	public static void cleanUp(){
		driver.quit();
	}
	
	
	
	
	
	

}
