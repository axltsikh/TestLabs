package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignUp {
    String isAdd;
    @BeforeMethod
    public void doAllTheJob() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        MainPage page = new MainPage(driver);
        page.OpenPage();
        ShoesPage all=page.GoToMenPage();
        Current currnet=all.openShoePage();
        isAdd=currnet.addtoBag();
    }
    @Test
    public void TestSignIn(){
        Assert.assertEquals(isAdd,"ДОБАВЛЕНО");
    }
}
