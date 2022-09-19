package PageObjectClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static BaseClass.BaseClass.driver;

public class OrderConfirmObjectClass {

    @FindBy(xpath = "//*[@id=\"finish\"]")
    WebElement finishbutton;
    @FindBy(xpath ="//*[@id=\"cancel\"]")
    WebElement cancelbutton;

    public OrderConfirmObjectClass(){
        PageFactory.initElements(driver, this);
    }


    public CompleteObjectClass completeorder(){
        finishbutton.click();
        return new CompleteObjectClass();
    }


}
