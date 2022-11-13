package testcases;

import BaseClass.Baseclass;
import PageObjectClasses.CartPageObjectClass;
import PageObjectClasses.HomePageObjectClass;
import org.testng.annotations.Test;

public class CartTest extends Baseclass {
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
