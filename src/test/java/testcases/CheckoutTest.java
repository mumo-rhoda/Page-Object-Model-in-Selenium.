package testcases;

import BaseClass.BaseClass;
import PageObjectClasses.CheckoutPageObjectClass;
import PageObjectClasses.CompleteObjectClass;
import PageObjectClasses.HomePageObjectClass;
import PageObjectClasses.OrderConfirmObjectClass;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseClass {
    CheckoutPageObjectClass checkout;
    OrderConfirmObjectClass orderconfirm;
    CompleteObjectClass complete;
    HomePageObjectClass homepage;
@Test(priority = 3)
    public void completetransaction(){
        checkout = new CheckoutPageObjectClass();
        orderconfirm = new OrderConfirmObjectClass();
        complete =new CompleteObjectClass();
        checkout.orderinformation("tester","saucelab","0100-NY");
        orderconfirm.completeorder();

        complete.verifypage();
        complete.finish();
        homepage=new HomePageObjectClass();
        homepage.signout();


    }
}
