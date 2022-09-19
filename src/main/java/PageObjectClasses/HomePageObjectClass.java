package PageObjectClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static BaseClass.BaseClass.driver;

public class HomePageObjectClass {

    @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
    WebElement logoutbtn;
    @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")
    WebElement menubar;
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement shoppingcart;
    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    WebElement product1;

    public HomePageObjectClass (){
        PageFactory.initElements(driver, this);
    }
    public LoginPageObjectClass signout (){
        menubar.click();
        logoutbtn.click();
        return new LoginPageObjectClass();
    }
    public String getCurrURL(){
        String homepageURL= driver.getCurrentUrl();
        return homepageURL;
    }
    public CartPageObjectClass putintocart(){
        product1.click();
        shoppingcart.click();
        return new CartPageObjectClass();
    }

}
