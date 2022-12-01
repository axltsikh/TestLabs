package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RunPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"bx_3966226736_97178_pict\"]")
    WebElement currentShoe;
    public RunPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }
    public ShoeItem openShoePage(){
        currentShoe.click();
        return new ShoeItem(driver);
    }
}
