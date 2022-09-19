package testcases;

import BaseClass.BaseClass;
import PageObjectClasses.CartPageObjectClass;
import PageObjectClasses.CheckoutPageObjectClass;
import PageObjectClasses.HomePageObjectClass;
import org.testng.annotations.Test;

public class CartTest extends BaseClass {
    HomePageObjectClass homepage;
    CartPageObjectClass cart;
    @Test (priority = 2)
    public void productsincart(){
        homepage = new HomePageObjectClass();
        cart = new CartPageObjectClass();
        homepage.putintocart();
        cart.checkout();
    }


}
