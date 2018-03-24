package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import steps.Hooks;

public class GoogleSearchResultsPage {

    private WebDriver driver;

    @FindBy(linkText = "Selenium - Web Browser Automation")
    private WebElement seleniumhqHomeSearchResult;


    public GoogleSearchResultsPage(){
        this.driver=Hooks.driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15), this);
    }

    public void clickSeleniumhqSearchResultLink(){
        seleniumhqHomeSearchResult.click();
    }

}
