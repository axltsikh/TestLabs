package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ShoeItem {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"product-58637\"]/div[1]/div/div[2]/form/div/div[2]/div/div/button")
    WebElement shoesButton;
    @FindBy(xpath = "//*[@id=\"cart321\"]/span/a/span")
    WebElement cartButton;
    //*[@id="cart321"]/span/a/span
    public ShoeItem(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }
    public void addtoBag() throws InterruptedException {
        shoesButton.click();
    }
    public CheckoutPage goToCart(){
        cartButton.click();
        return new CheckoutPage(driver);
    }
}
