package test;

import Page.MainPage;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

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
        assertThat(shoeName).isEqualTo("15 500 руб.");
    }
}
