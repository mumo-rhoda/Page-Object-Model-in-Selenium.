package PageObjectClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static BaseClass.BaseClass.driver;

public class CompleteObjectClass {

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/img")
    WebElement ponyexpresspic;
    @FindBy(xpath = "//*[@id=\"back-to-products\"]")
    WebElement backhomebtn;

    public CompleteObjectClass(){
        PageFactory.initElements(driver,this);
    }

    public boolean verifypage(){
        return ponyexpresspic.isDisplayed();


    }
    public HomePageObjectClass finish(){
        backhomebtn.click();
        return new HomePageObjectClass();
    }


}
