package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Current {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"product-58637\"]/div[1]/div/div[2]/form/div/div[2]/div/div/button")
    WebElement shoesButton;
    public Current(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }
    public String addtoBag() throws InterruptedException {
        shoesButton.click();
        Thread.sleep(2000);
        return shoesButton.getText();
    }

}
