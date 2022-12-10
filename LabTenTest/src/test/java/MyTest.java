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
        checkCart = new MainPage(driver)
                .OpenPage()
                .GoToRunPage()
                .openShoePage()
                .addtoBag()
                .getShoeName();
    }
    @Test
    private void MyTest(){
        Assert.assertEquals(checkCart,"WAVE DAICHI 7");
    }
}
