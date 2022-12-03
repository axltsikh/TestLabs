package test;

import Page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutFinalPriceCompareTest extends CommonConditions {
    @Test
    private void CheckIfCheckoutPriceIsRight(){
        String shoeName = new MainPage(driver)
                .openPage()
                .openRunPage()
                .openSingleItemPage()
                .addtoBag()
                .increaseQuantity()
                .moveToCheckoutPage()
                .getAllProductsPrice();
        Assert.assertEquals(shoeName,"15 500 руб.");
    }
}
