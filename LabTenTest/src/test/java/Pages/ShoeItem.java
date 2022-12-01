package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoeItem {
    WebDriver driver;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/section/div/div[2]/div[1]/div[3]/div[6]/a")
    WebElement cartButton;

    //*[@id="cart321"]/span/a/span
    public ShoeItem(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }
    public CheckoutPage addtoBag() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(cartButton));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(cartButton)).click();
        return new CheckoutPage(driver);
    }

}
