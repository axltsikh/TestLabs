package test;

import Page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveFromBagTest extends CommonConditions {
    @Test
    private void CheckIfRemoveTest(){
        String isRemoved = new MainPage(driver)
                .openPage()
                .openRunPage()
                .openSingleItemPage()
                .addtoBag()
                .removeButtonClick()
                .isRemoved();
        Assert.assertEquals(isRemoved,"Ваша корзина пуста");
    }
}
