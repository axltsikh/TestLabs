package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ShoesPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"js-product-list\"]/li[1]/div/a[1]/img")
    WebElement currentShoe;
    public ShoesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }
    public ShoeItem openShoePage(){
        currentShoe.click();
        return new ShoeItem(driver);
    }
}
