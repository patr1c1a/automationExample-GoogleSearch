package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import steps.Hooks;

public class GoogleHomePage {

    private final String URL = "http://www.google.com";
    private WebDriver driver;

    @FindBy(css="div.sfibbbc input#lst-ib")
    private WebElement searchBox;


    public GoogleHomePage(){
        this.driver=Hooks.driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
    }

    public void navigateToUrl() {
        driver.get(URL);
    }

    public void typeSearchTermInBox(String term){
        searchBox.sendKeys(term);
    }

    public void performSearchByKeyboard(){
        searchBox.sendKeys(Keys.ENTER);
    }

}
