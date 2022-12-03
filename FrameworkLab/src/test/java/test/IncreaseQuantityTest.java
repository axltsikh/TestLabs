package test;

import Page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IncreaseQuantityTest extends CommonConditions {
    @Test
    private void CheckIfAddedTest(){
        String quantity = new MainPage(driver)
                .openPage()
                .openRunPage()
                .openSingleItemPage()
                .addtoBag()
                .increaseQuantity()
                .getItemQuantity();
        Assert.assertEquals(quantity,"2");
    }
}
