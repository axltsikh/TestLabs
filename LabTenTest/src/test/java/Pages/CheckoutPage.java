package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[2]/form/div/div/div[3]/div[1]/table/tbody/tr/td[2]/h4/a")
    WebElement removeItemButton;
    public CheckoutPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }
    public String getShoeName(){
        return removeItemButton.getText().toString();
    }

}
