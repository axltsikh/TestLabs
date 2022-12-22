package test;

import Page.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
public class IncreaseQuantityTest extends CommonConditions {
    @Test
    private void CheckQunatityTest(){
        String quantity = new MainPage(driver)
                .openPage()
                .openRunPage()
                .openSingleItemPage()
                .addtoBag()
                .increaseQuantity()
                .getItemQuantity();
        assertThat(quantity).isEqualTo("2");
    }
}
