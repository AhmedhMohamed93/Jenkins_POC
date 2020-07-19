package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSetup 
{

    /****************************************************************************************************
     *                                                                                                  *
     *                                           Variables                                              *
     *                                                                                                  *
     ****************************************************************************************************/	
	
protected static WebDriver driver = null;
	 
@BeforeMethod
public void setup()
{
	getDriver();
}


public WebDriver getDriver()
{	System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();	     
    return driver;
}


@AfterMethod
public void tearDown()
{
    driver.quit();
}
	


}
	 
 
