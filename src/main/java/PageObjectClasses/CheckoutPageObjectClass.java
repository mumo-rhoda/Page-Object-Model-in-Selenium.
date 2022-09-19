package PageObjectClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static BaseClass.BaseClass.driver;

public class CheckoutPageObjectClass {
    @FindBy(xpath = "//*[@id=\"first-name\"]")
    WebElement Firstname;
    @FindBy(xpath = "//*[@id=\"last-name\"]")
    WebElement Lastname;
    @FindBy(xpath ="//*[@id=\"postal-code\"]")
    WebElement Postalcaode;
    @FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement contOrderconfirm;
    @FindBy(xpath = "//*[@id=\"cancel\"]")
    WebElement cancelbtn;

    public CheckoutPageObjectClass(){
        PageFactory.initElements(driver,this);
    }

    public OrderConfirmObjectClass orderinformation(String name1, String name2, String code){

        Firstname.click();
        Firstname.sendKeys(name1);
        Lastname.click();
        Lastname.sendKeys(name2);
        Postalcaode.click();
        Postalcaode.sendKeys(code);
        contOrderconfirm.click();
        return new OrderConfirmObjectClass();

    }

}
