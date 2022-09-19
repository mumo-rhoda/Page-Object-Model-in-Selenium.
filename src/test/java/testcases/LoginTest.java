package testcases;

import BaseClass.BaseClass;
import PageObjectClasses.LoginPageObjectClass;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    LoginPageObjectClass Loginpage;

    @BeforeSuite
    public void setup(){
        loadConfig();launchWeb();
    }

    @Test
    public void verifyloginpage(){
        Loginpage = new LoginPageObjectClass();
        boolean result = Loginpage.validateLogo();
        Assert.assertTrue(result);

    }

    @AfterSuite
    public void close(){
        driver.close();
    }

}
