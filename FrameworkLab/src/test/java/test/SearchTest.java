package test;

import Model.Item;
import Page.MainPage;
import Service.ItemCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends CommonConditions{
    @Test
    private void SearchTest(){
        Item item= ItemCreator.createShirtWithFullName();
        String itemName = new MainPage(driver)
                .openPage()
                .inputSearch(item.ItemName)
                .startSearch()
                .getSingleItemName();
        Assert.assertEquals(itemName,item.ItemName);
    }
}
