package test;

import Model.Item;
import Page.MainPage;
import Service.ItemCreator;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class PostPoneTest extends CommonConditions{
    @Test
    private void CheckIfPostPoneWorksTest(){
        Item item= ItemCreator.createShirt();
        String isPostponed = new MainPage(driver)
                .openPage()
                .openRunPage()
                .openSingleItemPage()
                .addtoBag()
                .postponeButtonClick()
                .moveToPostponeButtonClick()
                .isPostponed();
        assertThat(isPostponed).isEqualTo(item.ItemName);
    }
}
