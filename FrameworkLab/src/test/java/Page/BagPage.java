package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BagPage extends AbstractPage {
    public static String HOME_URL = "https://mizuno.com.ru/";
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[2]/form/div/div/div[3]/div[1]/table/tbody/tr/td[2]/h4/a")
    WebElement itemName;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[2]/form/div/div/div[3]/div[1]/table/tbody/tr/td[9]/div[1]/a\n")
    WebElement removeItemButton;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[2]/p/font")
    WebElement removeItemText;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[2]/form/div/div/div[3]/div[1]/table/tbody/tr/td[9]/div[2]/a")
    WebElement postponeButton;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[2]/form/div/div/div[1]/a[2]")
    WebElement moveToPostPoneButton;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[2]/form/div/div/div[3]/table/tbody/tr/td[2]/h4/a")
    WebElement checkPostponedItem;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[2]/form/div/div/div[3]/div[1]/table/tbody/tr/td[8]/div/div/div/div/input\n")
    WebElement quantityInput;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[2]/form/div/div/div[3]/div[1]/table/tbody/tr/td[8]/div/div/div/div/div[2]/button")
    WebElement increaseQuantityButton;
    @FindBy(xpath = "//*[@id=\"basket_items_list\"]/div[2]/div[4]/a")
    WebElement moveToCheckout;
    @FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[2]/form/div/div/div[3]/div[1]/table/tbody/tr/td[2]/div[2]")
    WebElement productSize;
    @Override
    protected AbstractPage openPage() {
        driver.navigate().to(HOME_URL);
        return this;
    }

    public BagPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
        log.info("BagPage opened");
    }
    public String getItemName(){
        log.info("Returned " + itemName.getText() + " from BagPage");
        return itemName.getText().toString();
    }
    public BagPage removeButtonClick(){
        removeItemButton.click();
        log.info("Removed item from bag");
        return this;
    }
    public String isRemoved(){
        log.info("Returned " + removeItemText.getText() + " from BagPage");
        return removeItemText.getText();
    }

    public BagPage postponeButtonClick(){
        postponeButton.click();
        log.info("Added item to postpone");
        return this;
    }
    public BagPage moveToPostponeButtonClick(){
        moveToPostPoneButton.click();
        log.info("Opened postpone tab");
        return this;
    }
    public String isPostponed(){
        log.info("Returned " + checkPostponedItem.getText() + " from BagPage");
        return checkPostponedItem.getText();
    }
    public BagPage increaseQuantity(){
        increaseQuantityButton.click();
        log.info("Increased item quantity by 1");
        return this;
    }
    public BagPage increaseQuantitySeveralTimes(int count) throws InterruptedException {
        for(int i=0;i<count;i++) {
            increaseQuantityButton.click();
        }
        log.info("Increased item quantity by " + count);
        Thread.sleep(4000);
        return this;
    }
    public String getItemQuantity(){
        log.info("Returned " + quantityInput.getAttribute("value") + " from BagPage");
        return quantityInput.getAttribute("value"); }
    public String getProductSize(){
        log.info("Returned " + productSize.getText() + " from CheckoutPage");
        return productSize.getText();
    }

    public CheckoutPage moveToCheckoutPage(){
        moveToCheckout.click();
        log.info("Moved to checkout page");
        return new CheckoutPage(driver);
    }
}
