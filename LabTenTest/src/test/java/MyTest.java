import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTest {
    String checkCart;
    @BeforeMethod
    public void doAllTheJob() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        MainPage page = new MainPage(driver);
        page.OpenPage();
        RunPage all=page.GoToRunPage();
        ShoeItem shoeItem=all.openShoePage();
        CheckoutPage afterRemovePage = shoeItem.addtoBag();
        checkCart=afterRemovePage.getShoeName();
    }
    @Test
    private void MyTest(){
        Assert.assertEquals(checkCart,"WAVE DAICHI 7");
    }
}
