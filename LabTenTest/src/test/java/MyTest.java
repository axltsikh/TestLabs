import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Network;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;

public class MyTest {
    String isRemoved;
    @BeforeMethod
    public void doAllTheJob() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        MainPage page = new MainPage(driver);
        page.OpenPage();
        ShoesPage all=page.GoToMenPage();
        ShoeItem shoeItem=all.openShoePage();
        shoeItem.addtoBag();
        Thread.sleep(2000);
        CheckoutPage checkoutPage=shoeItem.goToCart();
        AfterRemovePage afterRemovePage = checkoutPage.removeItem();
        isRemoved=afterRemovePage.getDeleteResult();
    }
    @Test
    private void MyTest(){
        Assert.assertEquals(isRemoved,"“New Balance 574” удален. Отменить?");
    }
}
