package testcases;

import BaseClass.Baseclass;
import PageObjectClasses.LoginPageObjectClass;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest extends Baseclass {
    LoginPageObjectClass Loginpage;

    @BeforeSuite
    public void setup(){
        loadConfig();launchWeb();
    }

    @Test
    public void verifyloginpage(){
        Loginpage = new LoginPageObjectClass();
        boolean result = Loginpage.validateLogo();
        Assert.assertTrue(result, String.valueOf(true));

    }

    @AfterSuite
    public void teardown(){
        driver.quit();
    }

}
