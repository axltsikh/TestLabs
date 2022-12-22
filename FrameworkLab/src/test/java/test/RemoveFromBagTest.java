package test;

import Page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
public class RemoveFromBagTest extends CommonConditions {
    @Test
    private void CheckIfRemoveTest() {
        String isRemoved = new MainPage(driver)
                .openPage()
                .openRunPage()
                .openSingleItemPage()
                .addtoBag()
                .removeButtonClick()
                .isRemoved();
        assertThat(isRemoved).isEqualTo("Ваша корзина пуста");
    }
}
