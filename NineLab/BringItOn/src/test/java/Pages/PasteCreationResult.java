package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PasteCreationResult {

    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/a[1]")
    private WebElement syntaxHihglights;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/ol")
    private WebElement codeTextArea;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/h1")
    private WebElement title;

    public PasteCreationResult(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30),this);
    }

    public String getTitle(){
        return title.getText();
    }
    public String getSyntaxHighlights(){
        return syntaxHihglights.getText();
    }
    public String getCode(){
        return codeTextArea.getText();
    }


}
