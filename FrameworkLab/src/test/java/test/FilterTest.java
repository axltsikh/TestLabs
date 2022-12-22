package test;

import Model.Item;
import Page.MainPage;
import Service.ItemCreator;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class FilterTest extends CommonConditions{
    @Test
    private void CheckFilterTest(){
        Item item= ItemCreator.createShorts();
        String firstItemPrice = new MainPage(driver)
                .openPage()
                .openRunPage()
                .openPriceFilter()
                .inputMaxPrice()
                .getFirstItemPrice();
        String buffer=firstItemPrice.substring(0,5);
        assertThat(Integer.valueOf(buffer)).isLessThan(5000);
    }
}
