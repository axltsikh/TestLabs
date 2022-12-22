package test;

import Model.Item;
import Page.MainPage;
import Service.ItemCreator;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


public class addToBagTest extends CommonConditions {
    @Test
    @Description("Adds item to bag and checks if operation is successfully")
    private void CheckIfAddedTest(){
        Item item= ItemCreator.createShirt();
        String shoeName = new MainPage(driver)
                .openPage()
                .openRunPage()
                .openSingleItemPage()
                .addtoBag()
                .getItemName();
        assertThat(shoeName).isEqualTo(item.ItemName);
    }
}
