package PageObjectClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static BaseClass.Baseclass.driver;

public class CartPageObjectClass {


    @FindBy(xpath = "//*[@id=\"checkout\"]")
    WebElement checkoutbutton;
    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
    WebElement removefromcart;
    @FindBy(xpath = "//*[@id=\"continue-shopping\"]")
    WebElement continueshopping;

    public CartPageObjectClass(){
        PageFactory.initElements(driver,this);
    }

    public CheckoutPageObjectClass checkout(){
        checkoutbutton.click();
        return new CheckoutPageObjectClass();
    }
}
