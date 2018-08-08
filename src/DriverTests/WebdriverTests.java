package DriverTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.JUnit4.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebdriverTests {

	static WebDriver driver = null;
	private static int testsCount = 0;
	@BeforeClass
	public static void setUpDrivers()
	{
		driver = new OperaDriver();
	}
	
	//parametrize for diff drivers
	@Test
	public static void imputCalcTest()
	{
		
	}
	
	@AfterClass
	public static void killDrivers()
	{
		driver.close();
		driver.quit();
	}
	

}
