package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CabinetPage extends AbstractPage{
    public static String HOME_URL = "https://mizuno.com.ru/";
    @Override
    protected AbstractPage openPage() {
        driver.navigate().to(HOME_URL);
        return this;
    }

    public CabinetPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }

}
