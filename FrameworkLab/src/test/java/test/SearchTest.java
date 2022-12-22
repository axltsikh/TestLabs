package test;

import Model.Item;
import Page.MainPage;
import Service.ItemCreator;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class SearchTest extends CommonConditions{
    @Test
    private void SearchTest(){
        Item item= ItemCreator.createShirtWithFullName();
        String itemName = new MainPage(driver)
                .openPage()
                .inputSearch(item.ItemName)
                .startSearch()
                .getSingleItemName();
        assertThat(itemName).isEqualTo(item.ItemName);
    }
}
