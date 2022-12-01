package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    String mainPage="https://mizuno.com.ru/";

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"catalog_menu\"]/div/div/div/nav/div/ul/li[2]")
    WebElement menButton;

    public MainPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public MainPage OpenPage(){
        driver.get(mainPage);
        return this;
    }
    public RunPage GoToRunPage(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(menButton)).click();
        return new RunPage(driver);
    }
}
