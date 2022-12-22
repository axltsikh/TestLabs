package test;

import Model.Item;
import Page.MainPage;
import Service.ItemCreator;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class ParametersTest extends CommonConditions {
    @Test
    private void CheckParametersTest(){
        Item item= ItemCreator.createXLShorts();
        String itemSize = new MainPage(driver)
                .openPage()
                .openRunPage()
                .openSingleShortsPage()
                .chooseSize()
                .addtoBag()
                .getProductSize();
        assertThat(itemSize).isEqualTo("Размер одежды: " + item.Size);
    }
}
