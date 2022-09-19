package testcases;
import BaseClass.BaseClass;
import PageObjectClasses.HomePageObjectClass;
import PageObjectClasses.LoginPageObjectClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseClass {
    @Test(priority = 1)
    public void homepagelogin() {
        LoginPageObjectClass Login = new LoginPageObjectClass();
        HomePageObjectClass HomePageObjectClass = Login.login(prop.getProperty("username"), (prop.getProperty("password")));
        String actualurl = HomePageObjectClass.getCurrURL();
        String expected = driver.getCurrentUrl();
        Assert.assertEquals(actualurl, expected);
    }
}
