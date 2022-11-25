package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AfterRemovePage {
    WebDriver driver;
    @FindBy(xpath = "/html/body/div[2]/main/div[1]/div/div/div/div")
    WebElement removeItemStatus;
    public AfterRemovePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }
    public String getDeleteResult() throws InterruptedException {
        return removeItemStatus.getText();
    }
}
