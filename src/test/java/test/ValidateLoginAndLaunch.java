package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pages.HomePage;
import utilities.BaseSetup;

public class ValidateLoginAndLaunch extends BaseSetup
{
	/****************************************************************************************************
     *                               Declaration of classes Objects                                     *
     ****************************************************************************************************/
    HomePage homePage;

    
    /****************************************************************************************************
     *                                                                                                  *
     *   Test Method Name : BD_ValidateLaunchWebsite()                                                  *
     *   Inputs           : String browser                                                              *
     *   Objective        : This Test is validating successful navigation to the BD Website             *
     *                                                                                                  *
     * @throws Throwable 																				*
     ****************************************************************************************************/

    @Test 
    public void BD_ValidateLaunchWebsite()
    {
    	homePage = new HomePage();
    	
    	assertEquals(homePage.Navigation(),"Welcome: Mercury Tours");
        
    }
 /*   
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
    */
    
    

}