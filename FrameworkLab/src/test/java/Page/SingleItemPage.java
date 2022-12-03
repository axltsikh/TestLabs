package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SingleItemPage extends AbstractPage {
    public static String HOME_URL = "https://mizuno.com.ru/";
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/section/div/div[2]/div[1]/div[3]/div[6]/a/span")
    WebElement addToCartButton;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/section/div/div[2]/div[1]/div[3]/div[3]/div[2]/div/div/ul/li[4]/span/span")
    WebElement chooseSize;
    @Override
    protected AbstractPage openPage() {
        driver.navigate().to(HOME_URL);
        return this;
    }

    public SingleItemPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(this.driver, 30),this);
    }
    public BagPage addtoBag() {
        addToCartButton.click();
        log.info("SingleItem added to Bag");
        return new BagPage(driver);
    }
    public SingleItemPage chooseSize(){
        chooseSize.click();
        log.info("Выбран размер XL");
        return this;
    }
}
