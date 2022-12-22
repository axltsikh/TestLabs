package test;

import Page.MainPage;
import Util.IntUtils;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class CheckQuantityCorrectionTest extends CommonConditions{
    @Test
    private void CheckQuantityTest() throws InterruptedException {
        String itemQuantity = new MainPage(driver)
                .openPage()
                .openRunPage()
                .openSingleItemPage()
                .addtoBag()
                .increaseQuantitySeveralTimes(IntUtils.getRandomInt())
                .getItemQuantity();
        assertThat(itemQuantity).isEqualTo("2");
    }
}
