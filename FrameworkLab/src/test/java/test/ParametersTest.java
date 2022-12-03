package test;

import Model.Item;
import Page.MainPage;
import Service.ItemCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParametersTest extends CommonConditions {
    @Test
    private void SearchTest(){
        Item item= ItemCreator.createXLShorts();
        String itemSize = new MainPage(driver)
                .openPage()
                .openRunPage()
                .openSingleShortsPage()
                .chooseSize()
                .addtoBag()
                .getProductSize();
        Assert.assertEquals(itemSize,"Размер одежды: " + item.Size);
    }
}
