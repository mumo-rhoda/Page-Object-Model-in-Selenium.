package PageObjectClasses;

import BaseClass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectClass extends Baseclass {
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]")
    WebElement swaglabslogo;
    @FindBy(xpath = "//*[@id=\"user-name\"]")
    WebElement username;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"login-button\"]")
    WebElement submitbtn;

    public LoginPageObjectClass(){
        PageFactory.initElements(driver,this);
    }
    public boolean validateLogo(){
        return swaglabslogo.isDisplayed();
    }
    public HomePageObjectClass login (String uname, String pswd){
        username.click();
        username.sendKeys(uname);
        password.sendKeys(pswd);
        submitbtn.click();
        return new HomePageObjectClass();

    }

}
